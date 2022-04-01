package se.filip.fordon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;
        System.out.println("Please follow the instructions to drive the car! \nYou drive faster by hitting the gas peddal multiple times \nPress 1-6 to control the car and anything else to stop the program");
        while(continueProgram){
            System.out.println("1. gas \n2. stop \n3.turn right \n4.turn left \n5.Check current speed \n6.Check current direction");
            String answer = scanner.nextLine();
            String pause;
            if (answer.equals("1")){
                car.gas();
                System.out.println("You go faster");
                System.out.println("Press Enter to continue");
                pause = scanner.nextLine();
            }
            else if (answer.equals("2")){
                if (car.stop()){
                    System.out.println("You stopped the car");
                    System.out.println("Press Enter to continue");
                }
                else{
                    System.out.println("The car is already parked");
                    System.out.println("Press Enter to continue");
                }
                car.stop();

                pause = scanner.nextLine();
            }
            else if (answer.equals("3")){
                car.turn(0);
                System.out.println("You turned right");
                System.out.println("Press Enter to continue");
                pause = scanner.nextLine();
            }
            else if (answer.equals("4")){
                car.turn(1);
                System.out.println("You turned left");
                System.out.println("Press Enter to continue");
                pause = scanner.nextLine();
            }
            else if (answer.equals("5")){
                System.out.println("You are currently going " + car.speed()+"km/h");
                System.out.println("Press Enter to continue");
                pause = scanner.nextLine();
            }
            else if (answer.equals("6")){
                System.out.println("You are traveling towards " + car.direction());
                System.out.println("Press Enter to continue");
                pause = scanner.nextLine();
            }
            else{
                continueProgram = false;
            }

        }

    }
}

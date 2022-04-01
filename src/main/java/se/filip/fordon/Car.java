package se.filip.fordon;

public class Car {
    private int kmh = 0;
    private String direction = "north";
    private String turn = "";
    private String moving = "stoped";


    public boolean gas(){
            this.moving = "going";
            this.kmh += 10;
            return true;
    }




    public String turn(int a){
        if (a == 1){
            this.turn = "left";
            return "left";
        }
        else{
            this.turn = "right";
            return "right";
        }
    }

    public boolean stop(){
        this.moving = moving;
        if (moving.equals("stoped")){
            return false;
        }
            moving ="stoped";
            this.kmh = 0;
            return true;
    }
    public String direction(){
        this.direction = direction;
        this.turn = turn;

        if (direction.equals("north")&& turn.equals("right") || direction.equals("south") && turn.equals("left")){
            direction = "east";
        }
        else if (direction.equals("east") && turn.equals("right") || direction.equals("west") && turn.equals("left")){
            direction = "south";
        }
        else if (direction.equals("south") && turn.equals("right") || direction.equals("north") && turn.equals("left")){
            direction = "west";
        }
        else if(direction.equals("west") && turn.equals("right") || direction.equals("east") && turn.equals("left")){
            direction = "north";
        }
        return direction;
    }

    public int speed(){
        return this.kmh;
    }

}

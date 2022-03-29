package se.filip.fordon;
import org.junit.jupiter.api.*;


class CarTest {

    Car car;

    @BeforeEach
    void setUp(){
        car = new Car();
    }

    @AfterEach
    void tearDown(){
        car = null;
    }

    @Test
    void gas() {
        boolean gas = car.gas(1);
        Assertions.assertTrue(gas);
        boolean noGas = car.gas(0);
        Assertions.assertFalse(noGas);
    }


    @Test
    @DisplayName("checking turn direction")
    void turn() {
        String leftTurn = car.turn(1);
        Assertions.assertEquals("left",leftTurn);
        String rightTurn = car.turn(0);
        Assertions.assertEquals("right",rightTurn);

    }

    @Test
    void stop() {
        boolean brake = car.stop(1);
        Assertions.assertTrue(brake);
        boolean noBrake = car.stop(0);
        Assertions.assertFalse(noBrake);

    }

    @Test
    void direction() {
        Assertions.assertEquals("north",car.direction());
        car.turn(0);
        Assertions.assertEquals("east",car.direction());
        car.turn(0);
        Assertions.assertEquals("south",car.direction());
        car.turn(0);
        Assertions.assertEquals("west",car.direction());
        car.turn(1);
        Assertions.assertEquals("south",car.direction());
    }

    @Test
    void speed() {
        car.gas(1);
        Assertions.assertEquals(10,car.speed());
    }
}
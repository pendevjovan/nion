import java.util.ArrayList;
import java.util.List;

abstract class Vehicle{
    Integer maxSpeed;
    public void move(){
        System.out.println("Vehicle is moving with " + maxSpeed);
    }
}
class Car extends Vehicle{
    @Override
    public void move() {
    }
}
class Bike extends Vehicle {
    @Override
    public void move() {
    }

}
public class Abstraction {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<Vehicle>();
        vehicles.add(new Car());
        vehicles.add(new Bike());
        Car car = new Car();
        car.maxSpeed = 100;
        car.move();
        Bike bike = new Bike();
        bike.maxSpeed = 60;
        bike.move();
    }
}
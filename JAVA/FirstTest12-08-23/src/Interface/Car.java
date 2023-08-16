package Interface;

public class Car implements MotorBike,Cycle {
    public void display(){
        System.out.println("Car name BMW.");

    }

    @Override
    public void distance() {
        System.out.println("Distance as 50 meter ");

    }

    @Override
    public void speed() {
        System.out.println("Speed as a 90km/Hrs.");

    }
}

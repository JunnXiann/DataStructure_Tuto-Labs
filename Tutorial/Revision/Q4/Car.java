package Tutorial.Revision.Q4;

public class Car extends Vehicle {
    public Car(double maxSpeed) {
        super(maxSpeed);
    }

    void accelerate() {
        currentSpeed += 1;
    }
}

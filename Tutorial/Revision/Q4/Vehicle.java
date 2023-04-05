package Tutorial.Revision.Q4;

public abstract class Vehicle {
    double maxSpeed;
    protected double currentSpeed;

    public Vehicle(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    abstract void accelerate();

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void pedalToTheMetal() {
        if (currentSpeed != maxSpeed) {
            accelerate();
        }
    }
}

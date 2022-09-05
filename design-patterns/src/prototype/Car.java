package prototype;

public class Car extends Vehicle{
    private int topSpeed;

    public int getTopSpeed() {
        return topSpeed;
    }
    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    @Override
    public String toString() {
        return "Car [topSpeed=" + topSpeed + "]";
    }

}

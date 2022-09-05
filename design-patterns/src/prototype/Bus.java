package prototype;

public class Bus extends Vehicle{
    private int doors;

    public int getDoors() {
        return doors;
    }
    public void setDoors(int doors) {
        this.doors = doors;
    }

    @Override
    public String toString() {
        return "Bus [doors=" + doors + "]";
    }

}

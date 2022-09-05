package prototype;

import java.util.HashMap;
import java.util.Map;

public class VehicleRegistry {
    private static Map<String, Vehicle> vehicleMap = new HashMap<>();

    public static Vehicle getVehicle(String vehicleType) {
        Vehicle regVehicle = vehicleMap.get(vehicleType);
        try {
            return (Vehicle) regVehicle.clone();
        } catch (CloneNotSupportedException e) {

            e.printStackTrace();
        }
        return regVehicle;
    }

    public static void loadRegistry() {
        Car car = new Car();
        car.setType("Car");
        car.setBrand("Bugatti");
        car.setColor("Blue");
        car.setTopSpeed(490);
        vehicleMap.put(car.getType(), car);

        Bus bus = new Bus();
        bus.setType("Bus");
        bus.setBrand("Yutong");
        bus.setColor("White");
        bus.setDoors(1);
        vehicleMap.put(bus.getType(), bus);
    }
}

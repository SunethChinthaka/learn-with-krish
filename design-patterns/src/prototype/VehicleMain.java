package prototype;

public class VehicleMain {
    public static void main(String[] args) {
        VehicleRegistry.loadRegistry();

        Vehicle clonedVehicle = (Vehicle) VehicleRegistry.getVehicle("Car");
        System.out.println("Vehicle : " + clonedVehicle.getType());

        Vehicle clonedVehicle2 = (Vehicle) VehicleRegistry.getVehicle("Bus");
        System.out.println("Vehicle : " + clonedVehicle2.getType());

        Vehicle clonedVehicle3 = (Vehicle) VehicleRegistry.getVehicle("Car");
        System.out.println("Vehicle : " + clonedVehicle3.getType());
    }
}

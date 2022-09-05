package singleton;

public class SingletonWashineMachineMain {

    public static void main(String[] args) {
        SingletonWashingMachine machine1=SingletonWashingMachine.getInstance();
        machine1.showMessage();
        SingletonWashingMachine machine2=SingletonWashingMachine.getInstance();
        machine2.showMessage();

        System.out.println(machine1.hashCode());
        System.out.println(machine2.hashCode());
    }
}

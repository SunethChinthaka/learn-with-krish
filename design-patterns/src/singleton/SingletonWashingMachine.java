package singleton;

public class SingletonWashingMachine {

    private static volatile SingletonWashingMachine instance =null;

    private SingletonWashingMachine() {}

    public static SingletonWashingMachine getInstance() {
        if (instance == null) {
            synchronized (SingletonWashingMachine.class) {
                if (instance == null) {
                    instance = new SingletonWashingMachine();

                }
            }
        }return instance;
    }
    public void showMessage(){
        System.out.println("I am Singleton Washing Machine");
    }

}

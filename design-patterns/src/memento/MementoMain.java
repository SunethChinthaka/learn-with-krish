package memento;

public class MementoMain {
    public static void main(String[] args) {
        Discoverer discoverer = new Discoverer();
        Keeper keeper = new Keeper();

        discoverer.setState("State 1");
        discoverer.setState("State 2");
        keeper.add(discoverer.saveStateToMemento());

        discoverer.setState("State 3");
        keeper.add(discoverer.saveStateToMemento());

        discoverer.setState("State 4");
        System.out.println("Current Saved State: " + discoverer.getState());

        discoverer.getStateFromMemento(keeper.get(0));
        System.out.println("First Auto Saved State: " + discoverer.getState());
        discoverer.getStateFromMemento(keeper.get(1));
        System.out.println("Second Auto Saved State: " + discoverer.getState());
    }
}

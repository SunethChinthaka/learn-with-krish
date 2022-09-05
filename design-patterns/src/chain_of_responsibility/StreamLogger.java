package chain_of_responsibility;

public class StreamLogger extends AbstractLogger {

    public StreamLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println(" Stream:Logger-> " + message);
    }

}
package chain_of_responsibility;

public class MemoryLogger extends AbstractLogger {
    public MemoryLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println(" Memory:Logger-> " + message);
    }
}

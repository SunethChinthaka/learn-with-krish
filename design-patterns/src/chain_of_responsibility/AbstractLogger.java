package chain_of_responsibility;

public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int SEVERE = 3;
    public static int WARNING = 4;

    protected int level;

    protected AbstractLogger nextLog;

    public void setNextLog(AbstractLogger nextLog) {
        this.nextLog = nextLog;
    }

    public void logMessage(int level, String message) {
        if (this.level <= level) {
            write(message);
        }
        if (nextLog != null) {
            nextLog.logMessage(level, message);
        }
    }

    abstract protected void write(String message);
}

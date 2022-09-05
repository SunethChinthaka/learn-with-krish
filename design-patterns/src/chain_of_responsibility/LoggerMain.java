package chain_of_responsibility;

public class LoggerMain {

    public static void main(String[] args) {
        AbstractLogger logger = getLoggers();

        logger.logMessage(AbstractLogger.INFO, "Show Information!!!");
        logger.logMessage(AbstractLogger.DEBUG, "Show Debug!!!");
        logger.logMessage(AbstractLogger.SEVERE, "Show Serve!!!");
        logger.logMessage(AbstractLogger.WARNING, "Show Warning!!!");
    }

    private static AbstractLogger getLoggers() {
        AbstractLogger cLogger = new ConsoleLogger(AbstractLogger.INFO);
        AbstractLogger fLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger mLogger = new MemoryLogger(AbstractLogger.SEVERE);
        AbstractLogger sLogger = new StreamLogger(AbstractLogger.WARNING);

        cLogger.setNextLog(fLogger);
        fLogger.setNextLog(mLogger);
        mLogger.setNextLog(sLogger);

        return cLogger;
    }
}

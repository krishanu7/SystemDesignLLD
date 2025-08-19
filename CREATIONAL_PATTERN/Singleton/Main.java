package SystemDesignLLD.CREATIONAL_PATTERN.Singleton;

public class Main {
    public static void main(String[] args){
        LoggerSingleton logger = LoggerSingleton.getInstance();
        logger.log("Application is successfully started");
        logger.log("Loading configuration...");
        logger.log("Configuration loaded successfully");
        LoggerSingleton anotherLogger = LoggerSingleton.getInstance();
        anotherLogger.log("This should still use the same logger instance.");
        System.out.println("Both logger instances are the same: " + (logger == anotherLogger));
    }
}
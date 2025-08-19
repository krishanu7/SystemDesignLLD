package SystemDesignLLD.CREATIONAL_PATTERN.Singleton;

public class LoggerSingleton {
    private static LoggerSingleton loggerInstance;

    private LoggerSingleton() {
        if(loggerInstance != null) {
            throw new IllegalStateException("LoggerInstance is already created");
        }
    }
    public static LoggerSingleton getInstance() {
        if(loggerInstance == null){
            synchronized (LoggerSingleton.class) {
                if(loggerInstance == null) {
                    loggerInstance = new LoggerSingleton();
                }
            }
        }
        return loggerInstance;
    }
    public void log(String msg){
        System.out.println("LOG: " + msg);
    }
}
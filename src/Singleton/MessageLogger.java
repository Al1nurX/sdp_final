package Singleton;

public class MessageLogger {
    private static MessageLogger instance;

    private MessageLogger(){}

    public static MessageLogger getInstance() {
        if (instance == null) {
            instance = new MessageLogger();
        }
        return instance;
    }

    public void logMessage(String message) {
        System.out.println("Message logged: " + message);
    }
}

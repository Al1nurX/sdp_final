package Strategy;

public class SMSStrategy implements Message {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

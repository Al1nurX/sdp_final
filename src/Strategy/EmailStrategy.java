package Strategy;

public class EmailStrategy implements Message {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending email: " + message);
    }
}

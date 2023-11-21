package Strategy;

public class MessageContext {
    private Message messageStrategy;

    public MessageContext(Message messageStrategy) {
        this.messageStrategy = messageStrategy;
    }

    public void sendMessage(String message) {
        this.messageStrategy.sendMessage(message);
    }
}

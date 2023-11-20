package Factory;

import Strategy.*;

public class MessageFactory {
    public static Message createMessage(String messageType) {
        return switch (messageType.toLowerCase()) {
            case "email" -> new EmailStrategy();
            case "sms" -> new SMSStrategy();
            default -> throw new IllegalArgumentException("Invalid message type: " + messageType);
        };
    }
}

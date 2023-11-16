package Factory;

import Strategy.*;

public class MessageFactory {
    public static Message createMessage(String type) {
        return switch (type.toLowerCase()) {
            case "email" -> new EmailStrategy();
            case "sms" -> new SMSStrategy();
            default -> throw new IllegalArgumentException("Invalid message type: " + type);
        };
    }
}

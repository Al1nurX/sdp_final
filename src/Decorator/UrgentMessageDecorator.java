package Decorator;

import Strategy.Message;

public class UrgentMessageDecorator extends MessageDecorator {

    public UrgentMessageDecorator(Message decoratedMessage) {
        super(decoratedMessage);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("This is urgent message!");
        this.decoratedMessage.sendMessage(message);
    }
}

package Decorator;

import Strategy.Message;

public abstract class MessageDecorator implements Message {
    protected Message decoratedMessage;

    public MessageDecorator(Message decoratedMessage) {
        this.decoratedMessage = decoratedMessage;
    }

    @Override
    public void sendMessage(String message) {
        this.decoratedMessage.sendMessage(message);
    }
}

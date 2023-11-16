package Adapter;

import Strategy.Message;

public class MessageServiceAdapter implements Message {
    private MessageService messageService;

    public MessageServiceAdapter(MessageService messageService) {
        this.messageService = messageService;
    }
    @Override
    public void sendMessage(String message) {
        messageService.sendMessageViaService(message);
    }
}

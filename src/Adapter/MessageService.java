package Adapter;

public class MessageService {
    public void sendMessageViaService(String message) {
        System.out.println("Sending message via external service: " + message);
    }
}

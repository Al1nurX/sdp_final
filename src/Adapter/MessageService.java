package Adapter;

public class MessageService {
    private boolean useExternalService;

    public void setUseExternalService(boolean useExternalService) {
        this.useExternalService = useExternalService;
    }

    public void sendMessageViaService(String message) {
        if (useExternalService) {
            System.out.println("Sending message through external service: " + message);
        } else {
            System.out.println("Sending message using default service: " + message);
        }
    }
}

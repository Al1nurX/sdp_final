import Adapter.*;
import Decorator.*;
import Factory.*;
import Observer.*;
import Singleton.*;
import Strategy.*;

import java.util.Scanner;

public class MessagingApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("To whom you want to send a message: ");
        String name = scanner.nextLine();
        User user = new User(name);

        MessageSubject messageSubject = new MessageSubject();
        messageSubject.addObserver(user);

        System.out.print("Enter message type (email/sms): ");
        String messageType = scanner.nextLine();
        Message strategy = MessageFactory.createMessage(messageType);

        MessageService externalService = new MessageService();
        System.out.print("Do you want to use the external service? (yes/no): ");
        String useExternalServiceInput = scanner.nextLine();
        externalService.setUseExternalService(useExternalServiceInput.equalsIgnoreCase("yes"));

        Message adapter = new MessageServiceAdapter(externalService);

        MessageLogger logger = MessageLogger.getInstance();

        System.out.print("Enter message: ");
        String message = scanner.nextLine();

        System.out.print("Do you want to send an urgent message? (yes/no): ");
        String sendUrgentMessage = scanner.nextLine();
        Message urgent;

        if (sendUrgentMessage.equalsIgnoreCase("yes")) {
            urgent = new UrgentMessageDecorator(strategy);
            urgent.sendMessage(message);
        } else {
            strategy.sendMessage(message);
        }

        adapter.sendMessage(message);

        logger.logMessage(message);

        messageSubject.notifyObservers(message);

        scanner.close();

    }
}

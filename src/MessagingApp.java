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
        Message adapter = new MessageServiceAdapter(externalService);

        Message urgent = new UrgentMessageDecorator(strategy);

        MessageLogger logger = MessageLogger.getInstance();

        System.out.print("Enter message: ");
        String message = scanner.nextLine();

        strategy.sendMessage(message);

        adapter.sendMessage(message);

        urgent.sendMessage(message);

        logger.logMessage(message);

        messageSubject.notifyObservers(message);
    }
}

# Messaging App Project 

## 1. Introduction

### Project Overview

The MessagingApp project is a Java application that demonstrates the implementation of various design patterns to create a flexible and extensible messaging system. The project incorporates design patterns such as Strategy, Observer, Factory, Singleton, Adapter, and Decorator to achieve a modular and maintainable design.

### Purpose

The purpose of this project is to showcase the practical application of design patterns in software development. Design patterns provide solutions to common problems encountered in software design and promote code reusability, scalability, and maintainability. By implementing these patterns in the context of a messaging application, the project aims to illustrate how design patterns can enhance the structure and functionality of a software system.

### Objectives

- Implement a messaging system that supports different message types (email, SMS) through the use of the Strategy pattern.
- Demonstrate the use of the Observer pattern to notify users when new messages are received.
- Use the Factory pattern to create message instances based on user input.
- Implement the Singleton pattern for a message logger to ensure a single, globally accessible instance.
- Utilize the Adapter pattern to integrate an external messaging service seamlessly.
- Showcase the Decorator pattern to add urgency to messages.

## 2. Project Requirements

### MessagingApp Class

The `MessagingApp` class serves as the entry point to the application. It captures user input for message creation, type selection, and external service usage. The class orchestrates the interaction between different components using design patterns.

### Adapter Package

The `Adapter` package contains classes related to the Adapter pattern. The `MessageService` class represents a messaging service, and `MessageServiceAdapter` adapts it to the `Message` interface.

### Decorator Package

The `Decorator` package implements the Decorator pattern. `MessageDecorator` is an abstract class for message decorators, and `UrgentMessageDecorator` adds urgency to messages.

### Factory Package

The `Factory` package demonstrates the Factory pattern. The `MessageFactory` class creates message instances based on user input.

### Observer Package

The `Observer` package includes classes for the Observer pattern. `NotificationManager` acts as the subject, and `User` is an observer that receives notifications of new messages.

### Singleton Package

The `Singleton` package showcases the Singleton pattern. `MessageLogger` ensures a single instance of the logger is used throughout the application.

### Strategy Package

The `Strategy` package implements the Strategy pattern. `EmailStrategy` and `SMSStrategy` represent different message strategies, and `MessageContext` uses a strategy to send messages.

### UML diagram

![final-project-diagram](https://github.com/Al1nurX/sdp_final/assets/125690106/8fea4f5d-da27-43c9-95a6-b6f8e3b44a78)

## 3. Conclusion

### Summary

The MessagingApp project successfully integrates multiple design patterns to create a modular and extensible messaging system. Each pattern plays a specific role in enhancing the application's architecture and functionality.

### Challenges Faced

During the development of the project, challenges were encountered in properly coordinating the interactions between different components. These challenges were mitigated through careful design and adherence to design principles.

### Future Improvements

Future enhancements may include additional message strategies, improved user interfaces, and further integration with external services. Additionally, the project could be expanded to support more advanced messaging features and customization options.

## 4. References

[Refactoring.Guru](https://refactoring.guru/design-patterns)

[DigitalOcean](https://www.digitalocean.com/community/tutorials/java-design-patterns-example-tutorial)

## Authors

- [@Al1nurX](https://www.github.com/Al1nurX)

# Sprint 3, Task 1: Design Patterns I

## 📋 Project Overview

This repository contains the implementation of object-oriented programming exercises focused on design patterns including Singleton, Abstract Factory, and Command patterns. The practice demonstrates how to build extensible and reusable software using fundamental design patterns.

## 💻 Technologies Used

- Java 17+
- IntelliJ IDEA (Recommended)
- No external libraries or frameworks used (pure Java)

## 🎮 Level 1 - Singleton Pattern: Undo Command

The exercise implements a Command interface, which the methods execute(), undo() and getCommandName(). Another interface
is implemented: the CommandHistory interface, which provides with the necessary commands to add to the stack of commands
(addCommand(), undoCommand(), getCommandHistory()). The class PrintCommand is the concrete class that implements the Command
interface, and the ChangesManager class is the one who is centralizing the command history through its only instance. 
RunMain class executes the programme logic.

Key Method: getInstance() - Returns the singleton instance (centralizes control through a unique instance).

## 🏭 Level 2 - Abstract Factory Pattern: International Contacts Agenda

The exercise implements a CountryContactFactory interface, which has the responsibility of replicating the logic of creating
addresses and phone numbers for contacts of different countries. There are two more interfaces, the Address and the
PhoneNumber interfaces, which provide the method needed to get the contact's address or phone number. Each country has
two concrete classes, which implement the instance attribute that defines addresses and phone numbers and the respective
method from the Address and PhoneNumber interfaces. A Contact class incorporates the Address and PhoneNumber as instance
attributes, and the Agenda centralizes the actions of adding, removing, validating and showing contact information. RunMain
class executes the programme logic.

## 🚗 Level 3 - Command Pattern: Vehicle Actions

The exercise implements 3 interfaces (Startable, Acceleratable and Brakeable) that correspond to vehicle behaviours (methods):
startEngine(), accelerate() and brake(). Concrete classes after 4 vehicle types (Car, Bicycle, Airplane, Ship) inherit
Vehicle type from its superclass. Command abstract interface define the execute() command, which is implemented in its
concrete classes StartCommand, AccelerateCommand and BrakeCommand. The VehicleControlSystem class acts as the invoker
capable of selecting which action is performed on runtime through its setCommand() method, and execute the command through
the pressButton() method. RunMain class, like in the previous exercises, executes the programme logic.


## 📝 Design Patterns Demonstrated

🏗️ Singleton Pattern

Purpose: Ensure only one instance exists throughout the application   
Use Case: Command history management

🏭 Abstract Factory Pattern

Purpose: Create families of related objects without specifying concrete classes   
Use Case: Contact agenda with international address and phone number formats

🎮 Command Pattern

Purpose: Encapsulate requests as objects, allowing parameterization and queuing   
Use Case: Vehicle control system with unified interface

## 🔍 Key OOP Concepts Demonstrated

Encapsulation: Data hiding and controlled access through methods
Polymorphism: Same interface, different implementations
Abstraction: Hiding complex implementation details
Inheritance: Code reuse through class hierarchies
Loose Coupling: Patterns promote decoupled system design

## 🛠️ How to Run
- Clone the repository
- Open the project using IntelliJ IDEA
- Run the Main classes for each exercise (Level_1.Exercise_1 executes singleton pattern, Level_2.Exercise_1 executes abstract factory pattern, Level_3.Exercise_1 executes command pattern).

## 👨‍💻 Author
Developed by Daniel Caldito Serrano as part of the Java Back-end Development Bootcamp organized by IT Academy.
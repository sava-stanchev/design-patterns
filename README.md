# Design Patterns

This repository contains implementations for common design patterns.

---

## Creational Patterns

### Singleton
Ensures a class has only one instance, and provides a global point of access to it.

### Factory Method
Defines an interface for creating an object, but lets subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.

### Abstract Factory
Provides an interface for creating families of related or dependent objects without specifying their concrete classes.

---

## Structural Patterns

### Adapter
Converts the interface of a class into another interface the clients expect. Adapter lets classes work together that couldn’t otherwise because of incompatible interfaces.

### Facade
Provides a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use.

### Decorator
Attaches additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.

---

## Behavioral Patterns

### Strategy
Defines a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy lets the algorithm vary independently from clients that use it.

### Observer
Defines a one-to-many dependency between objects so that when one object changes state, all of its dependents are notified and updated automatically.

### Command
Encapsulates a request as an object, thereby letting you parameterize other objects with different requests, queue or log requests, and support undoable operations.

### Template Method
Defines the skeleton of an algorithm in a method, deferring some steps to subclasses. Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm’s structure.

### Iterator
Provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.
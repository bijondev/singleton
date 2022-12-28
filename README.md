#Singleton design pattern

A singleton is a class that allows only a single instance of itself to be created and gives access to that created instance. It contains static variables that can accommodate unique and private instances of itself. It is used in scenarios when a user wants to restrict the instantiation of a class to only one object. This is helpful usually when a single object is required to coordinate actions across a system.

    Creational Patterns

Properties of Singleton Class

    Only one instance
    Globally accessible

Rules for making a class Singleton

The following rules are followed to make a Singleton class:

    A private constructor
    A static reference of its class
    One static method
    Globally accessible object reference
    Consistency across multiple threads

Singleton Example

Following is the example of Singleton class in java:

public class Singleton {

    private static Singleton instance = null;

    private Singleton() {
        
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

Following is the example of Singleton class in Kotlin:

Object Singleton {   init { println("Hello Singleton") }}

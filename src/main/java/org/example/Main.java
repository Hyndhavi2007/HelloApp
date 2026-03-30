package org.example;

/**
 * Main class for Hello Application
 * Demonstrates UC1, UC2 and UC3 using methods
 */
public class Main {
    public static void main(String[] args) {

        // ===== UC1: Print default message =====
        System.out.println("Hello, World!");
        // ===== UC2 & UC3 =====
        displayGreeting(args);
    }
    /**
     * UC2 & UC3 Method:
     * Displays a greeting message.
     * If a name is provided → greets user (UC2)
     * If no name is provided → uses default "World" (UC3)
     */
    public static void displayGreeting(String[] args) {
        // Default value (UC3)
        String name = "World";
        // Check if user has provided any input (UC2)
        if (args.length > 0) {
            name = args[0];
        }
        // Common output
        System.out.println("Hello, " + name + "!");
    }
}
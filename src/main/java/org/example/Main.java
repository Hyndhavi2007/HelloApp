package org.example;
/**
 * Main class for Hello Application
 * Demonstrates UC1 and UC2 using methods
 */
public class Main {
    public static void main(String[] args) {
        // ===== UC1: Print default message =====
        System.out.println("Hello, World!");
        // ===== UC2: Display greeting using user input =====
        displayGreeting(args);
    }
    /**
     * UC2 Method:
     * Displays a greeting message.
     * If a name is provided as a command-line argument,
     * it greets the user by name.
     * Otherwise, it shows a default message.
     */
    public static void displayGreeting(String[] args) {
        // Check if user has provided any input
        if (args.length > 0) {
            String name = args[0]; // Extract first argument (user name)
            // Print personalized greeting
            System.out.println("Hello, " + name + "!");
        } else {
            // Handle case when no input is given
            System.out.println("No name provided");
        }
    }
}
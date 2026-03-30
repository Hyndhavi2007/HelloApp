package org.example;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        displayGreeting(args);
    }
    public static void displayGreeting(String[] args) {
        String name = "World";
        // ===== UC4 START =====
        // UC4: Handle multiple user names from command-line arguments
        // If multiple names are provided, combine them into a single string
        // separated by commas (e.g., John, Mike, Anna)
        if (args.length > 0) {
            StringBuilder nameBuilder = new StringBuilder();
            for (int i = 0; i < args.length; i++) {
                nameBuilder.append(args[i]);
                // Add comma between names (except after last name)
                if (i < args.length - 1) {
                    nameBuilder.append(", ");
                }
            }
            name = nameBuilder.toString();
        }
        System.out.println("Hello, " + name + "!");
    }
}
/*
* StringBuilder is a class in java used to create and modify strings efficiently.
* Strings are immutable.
* So, every time we use "+", java
* 1. creates a new object
* 2.wastes memory
* 3.slows the performance
* String is like writing with pen where we cannot erase and rewrite new page.
* StringBuilder is like pencil where we can keep editing */
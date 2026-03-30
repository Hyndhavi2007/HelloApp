package org.example;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        displayGreeting(args);
    }
    public static void displayGreeting(String[] args) {
        String name = "World";
        // ===== UC5 START =====
        if (args.length > 0) {
            StringBuilder nameBuilder = new StringBuilder();
            boolean first = true;
            for (String n : args) {
                if (!first) {
                    nameBuilder.append(", ");
                }
                nameBuilder.append(n);
                first = false;
            }
            name = nameBuilder.toString();
        }
        System.out.println("Hello, " + name + "!");
    }
}/*
In UC-5 it does the same functionality as UC-4, but
1.Uses enhanced for loop
2.Code becomes simpler and readable
3.No need to manage i or args.length
We use enhanced for loop when:
1. We don't need index
2. We just want to read values
*/
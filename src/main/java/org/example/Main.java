package org.example;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        displayGreeting(args);
    }
    public static void displayGreeting(String[] args) {
        String name = "World";
        if (args.length > 0) {
            name = String.join(", ", args);
        }
        System.out.println("Hello, " + name + "!");
    }
}
/*
UC-7 Explanation:
1. Uses built-in String.join() method
2. Automatically joins names with ", "
3. No need for StringBuilder or loops
4. Simplest and cleanest approach

Why UC7:
- Less code
- More readable
- Uses Java built-in functionality
*/
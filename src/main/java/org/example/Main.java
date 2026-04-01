package org.example;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        displayGreeting(args);
    }
    public static void displayGreeting(String[] args) {
        String name = "World";
        if (args.length > 0) {
            StringBuilder nameBuilder = new StringBuilder();
            for (String n : args) {
                nameBuilder.append(n).append(", ");
            }
            if (nameBuilder.length() > 0) {
                name = nameBuilder.substring(0, nameBuilder.length() - 2);
            }
        }
        System.out.println("Hello, " + name + "!");
    }
}
/*
UC-6 Explanation:
1. Adds ", " after every name using StringBuilder
2. This creates an extra comma at the end
3. substring() is used to remove the last ", "
4. Produces clean output like: Hello, John, Mike, Anna!
Why UC6:
- Simpler logic (no need for boolean or index)
- Always append, then fix at the end
*/
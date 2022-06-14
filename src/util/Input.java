package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
        System.out.println("Enter a string:");
        String userInput = scanner.nextLine();
        return userInput;
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }

    public boolean yesNo(){
        System.out.println("Yes or no? (y/n)");
        String input = scanner.next();
        return input.equalsIgnoreCase("y");
    }

    public int getInt(){
        System.out.println("Enter an integer:");
        int userInput = scanner.nextInt();
        return userInput;
    }

    public int getInt(int min, int max) {
        String prompt = "Enter an integer between "
                + min + " and " + max;
        System.out.println(prompt);
        int userInput = scanner.nextInt();
        while (userInput < min || userInput > max) {
            System.out.println(prompt);
            userInput = scanner.nextInt();
        }
        return userInput;
    }

    public double getDouble(){
        System.out.println("Enter a number");
        double userInput = scanner.nextDouble();
        return userInput;
    }

    public double getDouble(String prompt){
        System.out.println(prompt);
        return scanner.nextDouble();
    }

    public double getDouble(double min, double max) {
        String prompt = "Enter an integer between "
                + min + " and " + max;
        System.out.println(prompt);
        double userInput = scanner.nextDouble();
        while (userInput < min || userInput > max) {
            System.out.println(prompt);
            userInput = scanner.nextDouble();
        }
        return userInput;
    }

}

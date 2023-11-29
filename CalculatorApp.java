 package com.example.gituploads;

import java.util.Scanner;

/**
 * It's a simple calculator with the services
 * add, sub, div and mod.
 * Prints out a menu for the user to choose,
 * receives the two choices num1, num2.
 * Prints the final result.
 */
public class CalculatorApp {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        int result;
        int num1;
        int num2;

        do {
            printMenu();
            choice = getNextInt("Please insert your choice: ");

            if (isChoiceInvalid(choice)) {
                System.out.println("Choice is invalid");
                continue;
            }
            if (isChoiceQuit(choice)) {
                break;
            }

            num1 = getNextInt("Please insert the first number (int)");
            num2 = getNextInt("Please insert the second number (int)");

            result = onChoiceGetResult(choice, num1, num2);
            System.out.println("Result = " + result);
        } while (true);
    }

    public static void printMenu() {
        System.out.println("Please choose one from below:");
        System.out.println("1. Add");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Mod");
        System.out.println("6. Exit");
    }

    public static int getNextInt(String message) {
        System.out.println(message);
        return in.nextInt();
    }

    public static boolean isChoiceInvalid(int choice) {

        return choice < 1 || choice > 6;
    }

    public static boolean isChoiceQuit(int choice) {
        return  choice ==6;

    }

    public static int add(int num1, int num2) {

        return num1 + num2;
    }

    public static int sub(int num1, int num2) {

        return num1 - num2;
    }

    public static int mul(int num1, int num2) {

        return num1 * num2;
    }

    public static int div(int num1, int num2) {
        if (num2 == 0) {
            return Integer.MAX_VALUE;
        }
        return num1 / num2;
    }

    public static int mod(int num1, int num2) {
        if (num2 == 0) {
            return Integer.MAX_VALUE;
        }
        return num1 % num2;
    }

    public static int onChoiceGetResult(int choice, int num1, int num2) {
        int result = 0;

        switch (choice)  {
            case 1:
                result = add(num1, num2);
                break;
            case 2:
                result = sub(num1, num2);
                break;
            case 3:
                result = mul(num1, num2);
                break;
            case 4:
                result = div(num1, num2);
                break;
            case 5:
                result = mod(num1, num2);
                break;
        }
        return result;
    }

}

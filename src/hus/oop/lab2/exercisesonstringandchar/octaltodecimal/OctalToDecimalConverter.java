package hus.oop.lab2.exercisesonstringandchar.octaltodecimal;

import java.util.Scanner;

public class OctalToDecimalConverter {

    // Method to convert an octal string to its equivalent decimal number
    public static int octalToDecimal(String octalStr) {
        if (octalStr == null || octalStr.isEmpty()) {
            throw new IllegalArgumentException("Input string is null or empty");
        }
        int decimal = 0;
        for (int i = 0; i < octalStr.length(); i++) {
            char c = octalStr.charAt(octalStr.length() - 1 - i);
            if (c < '0' || c > '7') {
                throw new IllegalArgumentException("Input string is not a valid octal string");
            }
            int octalValue = c - '0';
            decimal += octalValue * Math.pow(8, i);
        }
        return decimal;
    }

    // Method to prompt user for an octal string and convert it to decimal
    public static void testOctalToDecimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an octal string: ");
        String input = scanner.nextLine();
        try {
            int decimal = octalToDecimal(input);
            System.out.println("The equivalent decimal number is: " + decimal);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }

    public static void main(String[] args) {
        testOctalToDecimal();
    }
}

package hus.oop.lab2.exercisesonstringandchar.binarytodecimal;

import java.util.Scanner;

public class BinaryToDecimalConverter {

    // Method to convert a binary string to its equivalent decimal number
    public static int binaryToDecimal(String binStr) {
        if (binStr == null || binStr.isEmpty()) {
            throw new IllegalArgumentException("Input string is null or empty");
        }
        int decimal = 0;
        for (int i = 0; i < binStr.length(); i++) {
            char c = binStr.charAt(binStr.length() - 1 - i);
            if (c == '1') {
                decimal += Math.pow(2, i);
            } else if (c != '0') {
                throw new IllegalArgumentException("Input string is not a valid binary string");
            }
        }
        return decimal;
    }

    // Method to prompt user for a binary string and convert it to decimal
    public static void testBinaryToDecimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary string: ");
        String input = scanner.nextLine();
        try {
            int decimal = binaryToDecimal(input);
            System.out.println("The equivalent decimal number is: " + decimal);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }

    public static void main(String[] args) {
        testBinaryToDecimal();
    }
}

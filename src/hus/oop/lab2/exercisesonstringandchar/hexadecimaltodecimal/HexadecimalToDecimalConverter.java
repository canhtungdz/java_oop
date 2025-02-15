package hus.oop.lab2.exercisesonstringandchar.hexadecimaltodecimal;

import java.util.Scanner;

public class HexadecimalToDecimalConverter {

    // Method to convert a hexadecimal string to its equivalent decimal number
    public static int hexadecimalToDecimal(String hexStr) {
        if (hexStr == null || hexStr.isEmpty()) {
            throw new IllegalArgumentException("Input string is null or empty");
        }
        int decimal = 0;
        for (int i = 0; i < hexStr.length(); i++) {
            char c = hexStr.charAt(hexStr.length() - 1 - i);
            int hexValue;
            if (Character.isDigit(c)) {
                hexValue = c - '0';
            } else if (c >= 'A' && c <= 'F') {
                hexValue = 10 + (c - 'A');
            } else if (c >= 'a' && c <= 'f') {
                hexValue = 10 + (c - 'a');
            } else {
                throw new IllegalArgumentException("Input string is not a valid hexadecimal string");
            }
            decimal += hexValue * Math.pow(16, i);
        }
        return decimal;
    }

    // Method to prompt user for a hexadecimal string and convert it to decimal
    public static void testHexadecimalToDecimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a hexadecimal string: ");
        String input = scanner.nextLine();
        try {
            int decimal = hexadecimalToDecimal(input);
            System.out.println("The equivalent decimal number is: " + decimal);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }

    public static void main(String[] args) {
        testHexadecimalToDecimal();
    }
}

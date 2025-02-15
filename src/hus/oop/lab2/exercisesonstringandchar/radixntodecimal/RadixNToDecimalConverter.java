package hus.oop.lab2.exercisesonstringandchar.radixntodecimal;

import java.util.Scanner;

public class RadixNToDecimalConverter {

    // Method to convert a string of any radix (<= 16) to its equivalent decimal number
    public static int radixNToDecimal(String radixNStr, int radix) {
        if (radixNStr == null || radixNStr.isEmpty()) {
            throw new IllegalArgumentException("Input string is null or empty");
        }
        if (radix < 2 || radix > 16) {
            throw new IllegalArgumentException("Radix must be between 2 and 16");
        }
        int decimal = 0;
        for (int i = 0; i < radixNStr.length(); i++) {
            char c = radixNStr.charAt(radixNStr.length() - 1 - i);
            int value;
            if (Character.isDigit(c)) {
                value = c - '0';
            } else if (c >= 'A' && c <= 'F') {
                value = 10 + (c - 'A');
            } else if (c >= 'a' && c <= 'f') {
                value = 10 + (c - 'a');
            } else {
                throw new IllegalArgumentException("Input string contains invalid characters for the specified radix");
            }
            if (value >= radix) {
                throw new IllegalArgumentException("Input string contains digits outside the range of the specified radix");
            }
            decimal += value * Math.pow(radix, i);
        }
        return decimal;
    }

    // Method to prompt user for a radix n string and convert it to decimal
    public static void testRadixNToDecimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radix: ");
        int radix = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter the string: ");
        String input = scanner.nextLine();
        try {
            int decimal = radixNToDecimal(input, radix);
            System.out.println("The equivalent decimal number \"" + input + "\" is: " + decimal);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }

    public static void main(String[] args) {
        testRadixNToDecimal();
    }
}
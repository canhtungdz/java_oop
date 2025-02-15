package hus.oop.lab2.exercisesonstringandchar.checkhexstring;

import java.util.Scanner;

public class HexStringValidator {

    public static boolean isHexString(String hexStr) {
        if (hexStr == null || hexStr.isEmpty()) {
            return false;
        }
        for (char c : hexStr.toCharArray()) {
            if (!Character.isDigit(c) && (c < 'A' || c > 'F') && (c < 'a' || c > 'f')) {
                return false;
            }
        }
        return true;
    }

    public static void testHexString() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a hex string: ");
        String input = scanner.nextLine();
        if (isHexString(input)) {
            System.out.println("The input string is a hex string.");
        } else {
            System.out.println("The input string is NOT a hex string.");
        }
        scanner.close();
    }

    public static void main(String[] args) {
        testHexString();
    }
}

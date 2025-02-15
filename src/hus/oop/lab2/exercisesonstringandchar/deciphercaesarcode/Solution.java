package hus.oop.lab2.exercisesonstringandchar.deciphercaesarcode;

import java.util.Scanner;

public class Solution {
    public static String cipherCaesarCode(String inStr) {
        StringBuilder result = new StringBuilder();
        String inStrUpper = inStr.toUpperCase();
        for (int i = 0; i < inStrUpper.length(); i++) {
            result.append((char)('Z' - ('Z' - inStrUpper.charAt(i) + 3)%26));
        }
        return result.toString();
    }
    public static void testDeCipherCaesarCode() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("The ciphertext string is: ");
        String inStr = scanner.next();
        String codeInStr = cipherCaesarCode(inStr);
        System.out.println("The plaintext string is: " + codeInStr);
    }

    public static void main(String[] args) {
        testDeCipherCaesarCode();
    }
}

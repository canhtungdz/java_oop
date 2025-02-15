package hus.oop.lab2.exercisesonstringandchar.caesarcode;

import java.util.Scanner;

public class Solution {
    public static String cipherCaesarCode(String inStr) {
        StringBuilder result = new StringBuilder();
        String inStrUpper = inStr.toUpperCase();
        for (int i = 0; i < inStrUpper.length(); i++) {
            result.append((char)((inStrUpper.charAt(i) - 'A' + 3)%26 + 'A'));
        }
        return result.toString();
    }
    public static void testCipherCaesarCode() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a plaintext string: ");
        String inStr = scanner.next();
        String codeInStr = cipherCaesarCode(inStr);
        System.out.println("The ciphertext string is: " + codeInStr);
    }

    public static void main(String[] args) {
        testCipherCaesarCode();
    }
}

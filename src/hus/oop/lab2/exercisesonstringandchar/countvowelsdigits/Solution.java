package hus.oop.lab2.exercisesonstringandchar.countvowelsdigits;

import java.util.Scanner;

public class Solution {
    public static int countVowels(String inStr) {
        int result = 0;
        for (int i = 0; i < inStr.length(); i++) {
            if ("aeiouAEIOU".indexOf(inStr.charAt(i)) != -1) result++;
        }
        return result;
    }
    public static int countDigits(String inStr) {
        int result = 0;
        for (int i = 0; i < inStr.length(); i++) {
            if ("0123456789".indexOf(inStr.charAt(i)) != -1) result++;
        }
        return result;
    }
    public static void testCountVowelsDigits() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String inStr = sc.next();
        int numVowels = countVowels(inStr);
        int numDigits = countDigits(inStr);
        System.out.printf("Number of vowels: %d (%.2f%%)\n", numVowels, (double)numVowels/inStr.length()*100);
        System.out.printf("Number of digits: %d (%.2f%%)", numDigits, (double)numDigits/inStr.length()*100);
    }

    public static void main(String[] args) {
        testCountVowelsDigits();
    }
}

package hus.oop.lab2.exercisesonstringandchar.reversestring;

import java.util.Scanner;

public class Solution {
    public static String reverseString(String inStr) {
        StringBuilder result = new StringBuilder();
        for (int i = inStr.length()-1; i >= 0; i--) {
            result.append(inStr.charAt(i));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        testReverseString();

    }

    public static void testReverseString() {
        Scanner sc = new Scanner(System.in);
        String inStr;
        System.out.println("Enter a String: ");
        inStr = sc.next();
        String re = reverseString(inStr);
        System.out.println(re);
    }
}

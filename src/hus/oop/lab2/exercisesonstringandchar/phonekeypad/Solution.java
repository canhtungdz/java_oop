package hus.oop.lab2.exercisesonstringandchar.phonekeypad;

import java.util.Scanner;

public class Solution {
    public static String phoneKeyPad(String inStr) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < inStr.length(); i++) {
            int charIn = inStr.toLowerCase().charAt(i);
            switch (charIn) {
                case 'a':
                case 'b':
                case 'c':
                    result.append('2');
                    break;
                case 'd':
                case 'e':
                case 'f':
                    result.append('3');
                    break;
                case 'g':
                case 'h':
                case 'i':
                    result.append('4');
                    break;
                case 'j':
                case 'k':
                case 'l':
                    result.append('5');
                    break;
                case 'm':
                case 'n':
                case 'o':
                    result.append('6');
                    break;
                case 'p':
                case 'q':
                case 'r':
                case 's':
                    result.append('7');
                    break;
                case 't':
                case 'u':
                case 'v':
                    result.append('8');
                    break;
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    result.append('9');
                    break;
                default:

            }
        }
        return result.toString();
    }
    public static void testPhoneKeyPad() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String inStr = sc.next();
        String keyPad = phoneKeyPad(inStr);
        System.out.println("Key Pad: " + keyPad);
    }

    public static void main(String[] args) {
        testPhoneKeyPad();

    }
}

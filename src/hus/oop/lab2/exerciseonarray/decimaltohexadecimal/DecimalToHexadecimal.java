package hus.oop.lab2.exerciseonarray.decimaltohexadecimal;

import java.util.Scanner;

public class DecimalToHexadecimal {
    public static void main(String[] args) {
        DecimalToHexadecimal decimalToHexadecimal = new DecimalToHexadecimal();
        decimalToHexadecimal.testDecimalToHexadecimal();
    }

    public String decimalToHexadecimal(int positiveInteger) {
        return Integer.toHexString(positiveInteger).toUpperCase();
    }

    public void testDecimalToHexadecimal() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive decimal number: ");
        int decimalNumber = in.nextInt();
        String hexStr = decimalToHexadecimal(decimalNumber);
        System.out.println("The equivalent hexadecimal number is: " + hexStr);
    }
}

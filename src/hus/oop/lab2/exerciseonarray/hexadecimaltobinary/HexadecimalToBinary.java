package hus.oop.lab2.exerciseonarray.hexadecimaltobinary;

import java.util.Scanner;

public class HexadecimalToBinary {
    
    public String hexadecimalToBinary(String hexStr) {
        StringBuilder binaryStr = new StringBuilder();
        for (char hexChar : hexStr.toCharArray()) {
            String binary = Integer.toBinaryString(Integer.parseInt(String.valueOf(hexChar), 16));
            binaryStr.append(String.format("%4s", binary).replace(' ', '0'));
        }
        return binaryStr.toString();
    }

    public void testHexadecimalToBinary() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal string: ");
        String hexStr = in.nextLine();
        String binaryStr = hexadecimalToBinary(hexStr);
        System.out.println("The equivalent binary for hexadecimal \"" + hexStr + "\" is: " + binaryStr);
    }
}

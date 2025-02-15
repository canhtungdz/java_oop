package hus.oop.lab1;
import java.util.Scanner;
public class ReverseInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int a = scanner.nextInt();
        int z = 0;
        int c = a;
        while (c != 0) {
            z = z*10 + c % 10;
            c /= 10;
        }
        System.out.println("The reverse is: " + z);
    }
}

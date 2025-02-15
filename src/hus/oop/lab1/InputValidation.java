package hus.oop.lab1;
import java.util.Scanner;
public class InputValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        while (true) {
            System.out.print("Enter a number between 0-10 or 90-100: ");
            a = scanner.nextInt();
            if ((a>=0 && a <=10) || (a>=90 && a<=100)) {
                break;
            }
            System.out.println("Invalid input, try again...");
        }
        System.out.println("You have entered: " + a);
        scanner.close();
    }
}

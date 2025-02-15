package hus.oop.lab1;
import java.util.Scanner;
public class SumProductMinMax3 {
    public static void main(String[] args) {
        spmm3();
        spmm5();

    }

    private static void spmm5() {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for five integers
        System.out.print("Enter the first integer: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int number2 = scanner.nextInt();
        System.out.print("Enter the third integer: ");
        int number3 = scanner.nextInt();
        System.out.print("Enter the fourth integer: ");
        int number4 = scanner.nextInt();
        System.out.print("Enter the fifth integer: ");
        int number5 = scanner.nextInt();

        // Compute sum
        int sum = number1 + number2 + number3 + number4 + number5;

        // Compute product
        int product = number1 * number2 * number3 * number4 * number5;

        // Compute minimum
        int min = Math.min(number1, Math.min(number2, Math.min(number3, Math.min(number4, number5))));

        // Compute maximum
        int max = Math.max(number1, Math.max(number2, Math.max(number3, Math.max(number4, number5))));

        // Print results
        System.out.println("The sum is: " + sum);
        System.out.println("The product is: " + product);
        System.out.println("The minimum is: " + min);
        System.out.println("The maximum is: " + max);
        scanner.close();
    }

    private static void spmm3() {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int sum = n1 + n2 + n3;
        int product = n1 * n2 * n3;
        int min = n1;
        int max = n1;
        if (n2 > n1) {
            max = n2;
        } else {
            min = n2;
        }
        if (n3 > n2) {
            max = n3;
        }else {
            min = n3;
        }
        System.out.println("The sum is: " + sum);
        System.out.println("The product is: " + product);
        System.out.println("The min is: " + min);
        System.out.println("The max is: " + max);
    }
}

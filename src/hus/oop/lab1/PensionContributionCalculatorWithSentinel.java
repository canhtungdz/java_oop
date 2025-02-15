package hus.oop.lab1;
import java.util.Scanner;
public class PensionContributionCalculatorWithSentinel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inp;
        do {
            System.out.print("Enter the monthly salary (or −1 to end): $");
            double salary = scanner.nextDouble();
            if (salary == -1) {
                System.out.println("Bye!");
                break;
            }
            System.out.print("Enter the age: ");
            int age = scanner.nextInt();
            double employee = 0;
            double employer = 0;
            if (age <= 55) {
                employee = salary * 20 /100;
                employer = salary * 17 /100;
            } else if (age <= 60) {
                employee = salary * 13 /100;
                employer = salary * 13/100;
            } else if (age <=65) {
                employee = salary * 7.5/100;
                employer = salary * 9/100;
            } else {
                employee = salary * 5/100;
                employer = salary * 7.5/100;
            }
            System.out.println("The employee's contribution is: $" + employee);
            System.out.println("The employer's contribution is: $" + employer);
            System.out.println("The total contribution is: $" + (employee + employer));
        } while (true);

    }
}

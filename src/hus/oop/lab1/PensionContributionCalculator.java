package hus.oop.lab1;
import java.util.Scanner;
public class PensionContributionCalculator {
    public static void main(String[] args) {
        System.out.print("Enter the monthly salary: $");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();
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
    }
}

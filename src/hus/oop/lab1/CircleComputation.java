package hus.oop.lab1;
import java.util.Scanner;

public class CircleComputation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        double diameter = 2 * radius;
        double circumference = Math.PI * diameter;
        double area = Math.PI * radius * radius;
        System.out.printf("Radius: %.2f\n", radius);
        System.out.printf("Diameter: %.2f\n", diameter);
        System.out.printf("Circumference: %.2f\n", circumference);
        System.out.printf("Area: %.2f\n", area);

    }
}

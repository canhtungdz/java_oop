package hus.oop.lab1;

import java.util.Scanner;

public class CylinderComputation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        double baseArea = Math.PI * radius * radius;
        double surfaceArea = 4 * Math.PI * radius * radius;
        double volume = 4.0 /3 * Math.PI * radius * radius * radius;
        System.out.printf("Base Area: %.2f\n", baseArea);
        System.out.printf("Surface Area: %.2f\n", surfaceArea);
        System.out.printf("Volume: %.2f\n", volume);

        scanner.close();
    }

}

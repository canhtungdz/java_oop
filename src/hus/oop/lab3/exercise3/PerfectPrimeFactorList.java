package hus.oop.lab3.exercise3;

import java.util.Scanner;

public class PerfectPrimeFactorList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        int upperBound = in.nextInt();

        System.out.println("These numbers are equal to the product of prime factors:");
        int count = 0;
        for (int i = 2; i <= upperBound; i++) {
            if (NumberTheory.isProductOfPrimeFactors(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        System.out.printf("[%d numbers found (%.2f%%)]%n", count, 100.0 * count / upperBound);
    }
}

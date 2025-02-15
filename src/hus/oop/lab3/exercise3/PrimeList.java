package hus.oop.lab3.exercise3;

import java.util.Scanner;

public class PrimeList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the upper bound: ");
        int upperBound = in.nextInt();

        System.out.println("These numbers are prime:");
        int primeCount = 0;
        for (int i = 2; i <= upperBound; i++) {
            if (NumberTheory.isPrime(i)) {
                System.out.print(i + " ");
                primeCount++;
            }
        }
        System.out.println();
        System.out.printf("[%d primes found (%.2f%%)]%n", primeCount, 100.0 * primeCount / upperBound);
    }
}

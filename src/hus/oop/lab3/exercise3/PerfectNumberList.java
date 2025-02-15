package hus.oop.lab3.exercise3;

import java.util.Scanner;

public class PerfectNumberList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        int upperBound = in.nextInt();

        System.out.println("These numbers are perfect:");
        int perfectCount = 0;
        for (int i = 1; i <= upperBound; i++) {
            if (NumberTheory.isPerfect(i)) {
                System.out.print(i + " ");
                perfectCount++;
            }
        }
        System.out.println();
        System.out.printf("[%d perfect numbers found (%.2f%%)]%n", perfectCount, 100.0 * perfectCount / upperBound);

        System.out.println("These numbers are neither deficient nor perfect:");
        int neitherCount = 0;
        for (int i = 1; i <= upperBound; i++) {
            if (!NumberTheory.isPerfect(i) && !NumberTheory.isDeficient(i)) {
                System.out.print(i + " ");
                neitherCount++;
            }
        }
        System.out.println();
        System.out.printf("[%d numbers found (%.2f%%)]%n", neitherCount, 100.0 * neitherCount / upperBound);
    }
}

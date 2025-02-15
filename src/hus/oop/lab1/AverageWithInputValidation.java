package hus.oop.lab1;

import java.util.Scanner;

public class AverageWithInputValidation{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] markStudent = new int[3];
        for (int i = 0; i < 3; i++) {
            do {
                System.out.print("Enter the mark (0-100) for student " + (i + 1) + ": ");
                try {
                    markStudent[i] = sc.nextInt();
                } catch (Exception e) {
                    System.out.println("Try again...");
                    markStudent[i] = -1;
                }
                if (markStudent[i] >= 100 ||  markStudent[i] <= 0) System.out.println("Try again...");
            } while(markStudent[i] >= 100 ||  markStudent[i] <= 0);
        }
        double average = (double) (markStudent[0] + markStudent[1] + markStudent[2])/3;
        System.out.printf("%.2f", average);
    }
}

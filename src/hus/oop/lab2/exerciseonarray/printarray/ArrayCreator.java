package hus.oop.lab2.exerciseonarray.printarray;

import java.util.Scanner;

public class ArrayCreator {

    public static int[] createArray(Scanner in) {
        System.out.print("Enter the number of items: ");
        int numItems = in.nextInt();
        int[] items = new int[numItems];
        System.out.print("Enter the value of all items (separated by space): ");
        for (int i = 0; i < numItems; i++) {
            items[i] = in.nextInt();
        }
        return items;
    }

    public static void printArray(int[] arr) {
        System.out.print("The values are: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = createArray(scanner);
        printArray(array);
        scanner.close();
    }
}
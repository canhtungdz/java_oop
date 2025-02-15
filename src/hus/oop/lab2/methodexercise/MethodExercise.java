package hus.oop.lab2.methodexercise;

import java.util.Scanner;

public class MethodExercise {
    
    public static int exponent(int base, int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= base;
        }
        return result;
    }

    public static void testExponent() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base = in.nextInt();
        System.out.print("Enter the exponent: ");
        int exp = in.nextInt();
        int result = exponent(base, exp);
        System.out.println(base + " raises to the power of " + exp + " is: " + result);
    }

    public static boolean hasEight(int number) {
        while (number > 0) {
            if (number % 10 == 8) {
                return true;
            }
            number /= 10;
        }
        return false;
    }

    public static void testMagicSum() {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.print("Enter a positive integer (or -1 to end): ");
            int number = in.nextInt();
            if (number == -1) {
                break;
            }
            if (hasEight(number)) {
                sum += number;
            }
        }
        System.out.println("The magic sum is: " + sum);
    }

    public static void print(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static boolean contains(int[] array, int value) {
        for (int element : array) {
            if (element == value) {
                return true;
            }
        }
        return false;
    }

    public static int search(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static boolean equals(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] copyOf(int[] array) {
        int[] copy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return copy;
    }

    public static int[] copyOf(int[] array, int newLength) {
        int[] copy = new int[newLength];
        for (int i = 0; i < newLength && i < array.length; i++) {
            copy[i] = array[i];
        }
        return copy;
    }

    public static boolean swap(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            int temp = array1[i];
            array1[i] = array2[i];
            array2[i] = temp;
        }
        return true;
    }

    public static void reverse(int[] array) {
        int left = 0, right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        // Test on empty array
        int[] emptyArray = {};
        System.out.println("Empty array: " + arrayToString(emptyArray));

        // Test on one-element array
        int[] oneElementArray = {5};
        System.out.println("One-element array: " + arrayToString(oneElementArray));

        // Test on n-element array
        int[] nElementArray = {1, 2, 3, 4, 5};
        System.out.println("N-element array: " + arrayToString(nElementArray));

        // Test contains method
        int[] array = {1, 2, 3, 4, 5};
        int valueToFind = 3;
        System.out.println("Array contains " + valueToFind + ": " + contains(array, valueToFind));

        valueToFind = 6;
        System.out.println("Array contains " + valueToFind + ": " + contains(array, valueToFind));

        // Test search method
        valueToFind = 3;
        System.out.println("Index of " + valueToFind + " in array: " + search(array, valueToFind));

        valueToFind = 6;
        System.out.println("Index of " + valueToFind + " in array: " + search(array, valueToFind));

        // Test equals method
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        int[] array3 = {1, 2, 3, 4, 6};
        int[] array4 = {1, 2, 3, 4};

        System.out.println("Array1 equals Array2: " + equals(array1, array2)); // true
        System.out.println("Array1 equals Array3: " + equals(array1, array3)); // false
        System.out.println("Array1 equals Array4: " + equals(array1, array4)); // false

        // Test copyOf method
        int[] copy = copyOf(array);
        System.out.println("Original array: " + arrayToString(array));
        System.out.println("Copied array: " + arrayToString(copy));

        // Test copyOf method with new length
        int newLength = 3;
        int[] truncatedCopy = copyOf(array, newLength);
        System.out.println("Truncated copy: " + arrayToString(truncatedCopy));

        newLength = 7;
        int[] paddedCopy = copyOf(array, newLength);
        System.out.println("Padded copy: " + arrayToString(paddedCopy));

        // Test swap method
        int[] array5 = {1, 2, 3, 4, 5};
        int[] array6 = {6, 7, 8, 9, 10};
        int[] array7 = {11, 12, 13};

        System.out.println("Before swap:");
        System.out.println("Array5: " + arrayToString(array5));
        System.out.println("Array6: " + arrayToString(array6));

        boolean swapped = swap(array5, array6);
        System.out.println("Swapped: " + swapped);

        System.out.println("After swap:");
        System.out.println("Array5: " + arrayToString(array5));
        System.out.println("Array6: " + arrayToString(array6));

        swapped = swap(array5, array7);
        System.out.println("Swapped with different length arrays: " + swapped);

        // Test reverse method
        int[] array8 = {1, 2, 3, 4, 5};
        System.out.println("Original array: " + arrayToString(array8));
        reverse(array8);
        System.out.println("Reversed array: " + arrayToString(array8));
    }
}

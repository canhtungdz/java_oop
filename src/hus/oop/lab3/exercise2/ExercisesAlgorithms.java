package hus.oop.lab3.exercise2;

public class ExercisesAlgorithms {
    
    public static boolean linerSearch(int[] array, int key) {
        for (int element : array) {
            if (element == key) {
                return true;
            }
        }
        return false;
    }

    public static int linerSearchIndex(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static boolean binarySearch(int[] array, int key, int fromIdx, int toIdx) {
        if (fromIdx >= toIdx) {
            return false;
        }
        int midIdx = (fromIdx + toIdx) / 2;
        if (array[midIdx] == key) {
            return true;
        } else if (array[midIdx] > key) {
            return binarySearch(array, key, fromIdx, midIdx);
        } else {
            return binarySearch(array, key, midIdx + 1, toIdx);
        }
    }

    public static boolean binarySearch(int[] array, int key) {
        return binarySearch(array, key, 0, array.length);
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
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

    public static void main(String[] args) {
        // Test linerSearch method
        int[] array = {1, 2, 3, 4, 5};
        int key = 3;
        System.out.println("Array contains " + key + ": " + linerSearch(array, key));

        key = 6;
        System.out.println("Array contains " + key + ": " + linerSearch(array, key));

        // Test linerSearchIndex method
        key = 3;
        System.out.println("Index of " + key + " in array: " + linerSearchIndex(array, key));

        key = 6;
        System.out.println("Index of " + key + " in array: " + linerSearchIndex(array, key));

        // Test binarySearch method
        key = 3;
        System.out.println("Binary search for " + key + ": " + binarySearch(array, key, 0, array.length));

        key = 6;
        System.out.println("Binary search for " + key + ": " + binarySearch(array, key, 0, array.length));

        // Test overloaded binarySearch method
        key = 3;
        System.out.println("Binary search for " + key + " (overloaded): " + binarySearch(array, key));

        key = 6;
        System.out.println("Binary search for " + key + " (overloaded): " + binarySearch(array, key));

        // Test bubbleSort method
        int[] unsortedArray = {5, 3, 8, 4, 2};
        System.out.println("Unsorted array: " + arrayToString(unsortedArray));
        bubbleSort(unsortedArray);
        System.out.println("Sorted array: " + arrayToString(unsortedArray));

        // Test insertionSort method
        int[] anotherUnsortedArray = {9, 7, 5, 3, 1};
        System.out.println("Unsorted array: " + arrayToString(anotherUnsortedArray));
        insertionSort(anotherUnsortedArray);
        System.out.println("Sorted array: " + arrayToString(anotherUnsortedArray));
    }
}

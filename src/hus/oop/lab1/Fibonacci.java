package hus.oop.lab1;

public class Fibonacci {
    public static void main(String[] args) {
        fibonacci();
        tribonacci();
    }

    private static void tribonacci() {
        int n = 20;
        int[] tribonacci = new int[n];

        tribonacci[0] = 1;
        tribonacci[1] = 1;
        tribonacci[2] = 2;

        for (int i = 3; i < n; ++i) {
            tribonacci[i] = tribonacci[i - 1] + tribonacci[i - 2] + tribonacci[i - 3];
        }

        System.out.println("The first twenty Tribonacci numbers are:");
        for (int i = 0; i < n; ++i) {
            System.out.print(tribonacci[i] + " ");
        }
    }

    private static void fibonacci() {
        int f1 = 1;
        int f2 = 1;
        int fn = 0;
        System.out.println("The first 20 fibonacci number is: ");
        System.out.print(f1 + " ");
        System.out.print(f2 + " ");
        double avg = f1 + f2;
        for (int i = 0; i < 18; i++) {
            fn = f1 + f2;
            System.out.print(fn + " ");
            avg += fn;
            f1 = f2;
            f2 = fn;
        }
        System.out.println();
        System.out.println("The average is : " + (double)avg/20);
    }
}

package hus.oop.lab1;

public class Factorial {
    public static void main(String[] args) {
        long f1 = Factor(10);
        System.out.println(f1);
    }

    private static long Factor(int n) {
        long fac = 1;
        for (int i = 1; i <= n; i++) {
            fac *= i;
        }
        return fac;
    }
}

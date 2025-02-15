package hus.oop.lab3.exercise1;

public class NumberTheory {
    
    public static boolean isPerfect(int aPosInt) {
        int sum = 0;
        for (int i = 1; i <= aPosInt / 2; i++) {
            if (aPosInt % i == 0) {
                sum += i;
            }
        }
        return sum == aPosInt;
    }

    public static boolean isDeficient(int aPosInt) {
        int sum = 0;
        for (int i = 1; i <= aPosInt / 2; i++) {
            if (aPosInt % i == 0) {
                sum += i;
            }
        }
        return sum < aPosInt;
    }

    public static boolean isPrime(int aPosInt) {
        if (aPosInt <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(aPosInt); i++) {
            if (aPosInt % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isProductOfPrimeFactors(int aPosInt) {
        int product = 1;
        for (int i = 2; i <= aPosInt / 2; i++) {
            if (aPosInt % i == 0 && isPrime(i)) {
                product *= i;
            }
        }
        return product == aPosInt;
    }

    public static int gcd(int a, int b) {
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("Both a and b must be positive integers.");
        }
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

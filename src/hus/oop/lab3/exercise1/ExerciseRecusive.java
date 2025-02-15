package hus.oop.lab3.exercise1;

public class ExerciseRecusive {
    
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int numOfDigits(int n) {
        return String.valueOf(n).length();
    }

    public static int lengthOfS(int n) {
        if (n == 1) {
            return 1;
        }
        return lengthOfS(n - 1) + numOfDigits(n);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        // Test factorial method
        int number = 5;
        System.out.println("Factorial of " + number + " is: " + factorial(number));

        // Test fibonacci method
        int fibNumber = 10;
        System.out.println("Fibonacci of " + fibNumber + " is: " + fibonacci(fibNumber));

        // Test lengthOfS method
        int specialNumber = 12;
        System.out.println("Length of S(" + specialNumber + ") is: " + lengthOfS(specialNumber));

        // Test gcd method
        int a = 48;
        int b = 18;
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd(a, b));
    }
}

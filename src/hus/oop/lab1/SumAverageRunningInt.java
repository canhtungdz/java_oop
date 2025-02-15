package hus.oop.lab1;

public class SumAverageRunningInt {
    public static void useForLoop(int lowerbound, int upperbound) {
        System.out.println("*Use For Loop");
        int sum = 0;
        double average;

        for (int number = lowerbound; number <= upperbound; ++number) {
            sum += number;
        }

        average = (double) sum / (upperbound - lowerbound + 1);

        System.out.println("The sum of " + lowerbound + " to " + upperbound + " is " + sum);
        System.out.println("The average is " + average);
    }
    public static void useWhileLoop(int lowerbound, int upperbound) {
        System.out.println("*Use While Loop");
        int sum = 0;
        double average;
        int number = lowerbound;
        while (number <= upperbound) {
            sum += number++;
        }
        average = (double) sum / (upperbound - lowerbound + 1);
        System.out.println("The sum of " + lowerbound + " to " + upperbound + " is " + sum);
        System.out.println("The average is " + average);
    }
    public static void useDoWhileLoop(int lowerbound, int upperbound) {
        System.out.println("*Use Do While Loop");
        int sum = 0;
        double average;
        int number = lowerbound;
        if (lowerbound <= upperbound) {
            do {
                sum += number++;
            } while (number <= upperbound);
        }
        average = (double) sum / (upperbound - lowerbound + 1);
        System.out.println("The sum of " + lowerbound + " to " + upperbound + " is " + sum);
        System.out.println("The average is " + average);

    }
    public static void sumOfSquare(int lowerbound, int upperbound) {
        int sum = 0;
        for (int i = lowerbound; i <= upperbound; i++) {
            sum += i*i;
        }
        System.out.println("Sum of square from " + lowerbound + " to " + upperbound + " :" + sum);
    }

    public static void produceTwoSums(int lowerbound, int upperbound) {
        int sumOdd = 0;
        int sumEven = 0;
        int absDiff;
        for (int i = lowerbound; i <= upperbound; i++) {
            if (i % 2 == 0) sumEven += i;
            else sumOdd += i;
        }
        absDiff = (sumOdd > sumEven)? sumOdd - sumEven : sumEven - sumOdd;
        System.out.println("Sum Odd: " + sumOdd);
        System.out.println("Sum Even: " + sumEven);
        System.out.println("AbsDiff : " + absDiff);
    }
    public static void main(String[] args) {
//        useForLoop(111,8899);
//        useWhileLoop(1,100);
//        useDoWhileLoop(1,100);

//        sumOfSquare(1,100);

        produceTwoSums(1,100);
    }
}

package hus.oop.lab1;

public class CheckOddEven {
    private static void check(int num) {
        if (num % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
        System.out.println("Bye!");
    }
    public static void main(String[] args) {
        check(50);
    }
}

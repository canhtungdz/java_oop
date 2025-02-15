package hus.oop.lab1;

public class PrintDayInWord {
    public static void usingNestedIf(int dayNumber) {
        // (a) Using nested-if statement
        System.out.print("Using nested-if: ");
        if (dayNumber == 0) {
            System.out.println("Sunday");
        } else if (dayNumber == 1) {
            System.out.println("Monday");
        } else if (dayNumber == 2) {
            System.out.println("Tuesday");
        } else if (dayNumber == 3) {
            System.out.println("Wednesday");
        } else if (dayNumber == 4) {
            System.out.println("Thursday");
        } else if (dayNumber == 5) {
            System.out.println("Friday");
        } else if (dayNumber == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Not a valid day");
        }
    }
    public static void usingSwitchCase(int dayNumber) {
        // (b) Using switch-case-default statement
        System.out.print("Using switch-case: ");
        switch (dayNumber) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Not a valid day");
                break;
        }
    }
    public static void main(String[] args) {
        usingNestedIf(3);
        usingSwitchCase(3);
    }
}

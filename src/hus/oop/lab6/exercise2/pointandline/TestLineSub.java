package hus.oop.lab6.exercise2.pointandline;

public class TestLineSub {
    public static void main(String[] args) {
        Point line1 = new LineSub(1, 2, 3, 4);
        System.out.println(line1);
        ((LineSub)line1).setBeginXY(5, 6);
        ((LineSub)line1).setEndXY(7, 8);
        System.out.println(line1);

    }
}

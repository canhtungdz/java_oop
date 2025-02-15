package hus.oop.lab1;

public class HarmonicSum {
    public static void main(String[] args) {
        int n = 50000;
        double sumL = 0;
        double sumR = 0;
        for (int i = 1; i <= n; i++) {
            sumL += (double) 1/i;
            sumR += (double) 1/(n - i + 1);
        }
        System.out.println("Sum Left to Right: " + sumL);
        System.out.println("Sum Right to Left: " + sumR);
        System.out.println(Math.abs(sumL - sumR));

    }
}

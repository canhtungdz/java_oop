package hus.oop.lab1;

public class ComputePI {
    public static void main(String[] args) {
        double sum = 0;
        int MAX_DENOMINATOR = 1000000;
        for (int i = 1; i < MAX_DENOMINATOR ; i += 2) {
            if (i % 4 == 1) {
                sum += (double) 1/i;
            } else {
                sum -= (double) 1/i;
            }
        }
        double fakepi = 4*sum;
        System.out.println(4*sum);
        System.out.println("Accuracy: " + (double)(fakepi / Math.PI)*100);
    }
}

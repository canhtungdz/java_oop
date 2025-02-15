package hus.oop.lab1;

public class ExtractDigits {
    public static void main(String[] args) {
        int n = 15423;
        int c = n;
        String s = "";
        while (c >= 10) {
            s += c % 10;
            s += " ";
            c /= 10;
        }
        s += c % 10;
        System.out.println(s);
    }
}

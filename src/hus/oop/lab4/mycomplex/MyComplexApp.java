package hus.oop.lab4.mycomplex;

import java.util.Scanner;

public class MyComplexApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter complex number 1 (real and imaginary part): ");
        MyComplex myComplex1 = new MyComplex(scanner.nextDouble(), scanner.nextDouble());
        System.out.print("Enter complex number 2 (real and imaginary part): ");
        MyComplex myComplex2 = new MyComplex(scanner.nextDouble(), scanner.nextDouble());
        System.out.println("Number 1 is: " + "(" + myComplex1 + ")");
        System.out.println("(" + myComplex1 + ") is " + (myComplex1.isReal() ? "" : "NOT") + " a pure real number");
        System.out.println("(" + myComplex1 + ") is " + (myComplex1.isImaginary() ? "" : "NOT") + " a pure real number");
        System.out.println();
        System.out.println("Number 2 is: " + "(" + myComplex2 + ")");
        System.out.println("(" + myComplex2 + ") is " + (myComplex2.isReal() ? "" : "NOT") + " a pure real number");
        System.out.println("(" + myComplex2 + ") is " + (myComplex2.isImaginary() ? "" : "NOT") + " a pure real number");
        System.out.println();
        System.out.println("(" + myComplex1 + ") is" + (myComplex1.equals(myComplex2) ? "" : "NOT") + " equal to (" + myComplex2 + ")");
        System.out.println("(" + myComplex1 + ") + (" + myComplex2 + ") = (" + myComplex1.addNew(myComplex2) + ")");
    }
}

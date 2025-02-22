package hus.oop.lab5.exercise1.mycomplex;

public class TestMyComplex {
    public static void main(String[] args) {
        MyComplex myComplex1 = new MyComplex(2, 3);
        MyComplex myComplex2 = new MyComplex(5, 6);

        // Test getters
        System.out.println("myComplex1 has real: " + myComplex1.getReal());
        System.out.println("myComplex1 has imag: " + myComplex1.getImag());

        // Test setters
        myComplex1.setReal(5);
        myComplex1.setImag(7);
        System.out.println("myComplex1 after set: " + myComplex1);
        myComplex1.setValue(3, 1);
        System.out.println("myComplex1 after set value: " + myComplex1);

        // Test toString
        System.out.println(myComplex1);

        // Test isReal
        System.out.println(myComplex1.isReal());

        // Test isImaginary
        System.out.println(myComplex1.isImaginary());

        // Test equals with 2 parameters
        System.out.println(myComplex1.equals(3, 1));

        // Test equals with 1 parameter
        System.out.println(myComplex1.equals(myComplex2));

        // Test magnitude
        System.out.println(myComplex1.magnitude());

        // Test add
        myComplex1.add(myComplex2);
        System.out.println(myComplex1);

        // Test addNew
        MyComplex myComplex3 = myComplex1.addNew(myComplex2);
        System.out.println(myComplex3);

        // Test subtract
        myComplex1.subtract(myComplex2);
        System.out.println(myComplex1);

        // Test subtractNew
        MyComplex myComplex4 = myComplex1.subtractNew(myComplex2);
        System.out.println(myComplex4);

        // Test multiply
        myComplex1.multiply(myComplex2);
        System.out.println(myComplex1);

        // Test divide
        myComplex1.divide(myComplex2);
        System.out.println(myComplex1);

        // Test conjugate
        myComplex1.conjugate();
        System.out.println(myComplex1);
    }
}

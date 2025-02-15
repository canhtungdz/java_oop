package hus.oop.lab4.mycomplex;

public class TestMyComplex {
    public static void main(String[] args) {
        MyComplex myComplex1 = new MyComplex(2, 3);
//        test Getter
        System.out.println("myComplex1 has real: " + myComplex1.getReal());
        System.out.println("myComplex1 has imag: " + myComplex1.getImag());
//        test Setter
        myComplex1.setReal(5);
        myComplex1.setImag(7);
        System.out.println("myComplex1 after set: " + myComplex1);
        myComplex1.setValue(3, 1);
        System.out.println("myComplex1 after set value: " + myComplex1);

//        test ToString
        System.out.println(myComplex1);
//        test isReal
        System.out.println(myComplex1.isReal());
//        test isImaginary
        System.out.println(myComplex1.isImaginary());
//        test Equals with 2 parameter
        System.out.println(myComplex1.equals(3, 1));
//        test equals with 1 parameter
        MyComplex myComplex2 = new MyComplex(5, 6);
        System.out.println(myComplex1.equals(myComplex2));
//        test magnitude
        System.out.println(myComplex1.magnitude());
//        test addInto
        myComplex1.addInto(myComplex2);
        System.out.println(myComplex1);
//        test addNew
        MyComplex myComplex3 = myComplex1.addNew(myComplex2);
        System.out.println(myComplex3);
    }
}

package hus.oop.lab4.MyPolynomial;

public class MyPolynomial {
    private double[] coeffs;
    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }
    public int getDegree() {
        return coeffs.length - 1;
    }

    @Override
    public String toString() {
        String toString = "";
        for (int i = 0; i < coeffs.length - 1; i++) {
            toString += coeffs[i] + "x^" + (coeffs.length-1 - i) + " + ";
        }
        toString += coeffs[coeffs.length-1];
        return toString;
    }
    public double evaluate(double x) {
        double evaluate = 0;
        for (int i = 0; i < coeffs.length; i++) {
            evaluate += coeffs[i] * Math.pow(x, coeffs.length-1 - i);
        }
        return evaluate;
    }
    public MyPolynomial add(MyPolynomial right) {
        return this;
    }
}

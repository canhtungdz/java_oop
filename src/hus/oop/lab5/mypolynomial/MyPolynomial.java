package hus.oop.lab5.mypolynomial;

public class MyPolynomial{
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
    public MyPolynomial add(MyPolynomial another) {
        MyPolynomial result = this;
        if (result.getDegree() < another.getDegree()) {
            result = another;
            another = this;
        }

        double[] resultCoeffs = result.coeffs;
        double[] anotherCoeffs = another.coeffs;
        for (int i = 0; i < resultCoeffs.length; i++) {
            if (i > anotherCoeffs.length - 1) {
                continue;
            }
            resultCoeffs[i] += anotherCoeffs[i];
        }
        return new MyPolynomial(resultCoeffs);
    }

    //multiply
    public MyPolynomial multiply(MyPolynomial another) {
        int newDegree = this.getDegree() + another.getDegree();
        double[] newCoeffs = new double[newDegree + 1];
        for (int i = 0; i < this.getDegree(); i++) {
            for (int j = 0; j < another.getDegree(); j++) {
                newCoeffs[i+j] += this.coeffs[i] + another.coeffs[j];
            }
        }
        return new MyPolynomial(newDegree);
    }

}



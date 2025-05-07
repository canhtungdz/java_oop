package hus.oop.lab9.exercise2.ex3;

/**
 * Class representing a polynomial with coefficients stored as an array of doubles.
 */
public class ArrayPoly extends AbstractPoly {
    private final double[] coefficients;

    public ArrayPoly(double[] coefficients) {
        this.coefficients = coefficients;
    }

    @Override
    public int degree() {
        return coefficients.length - 1;
    }

    @Override
    public Poly derivative() {
        return new ArrayPoly(derive());
    }

    @Override
    public double coefficient(int degree) {
        if (degree < 0 || degree >= coefficients.length) {
            throw new IllegalArgumentException("Invalid degree: " + degree);
        }
        return coefficients[degree];
    }

    @Override
    public double[] coefficients() {
        return coefficients;
    }
}

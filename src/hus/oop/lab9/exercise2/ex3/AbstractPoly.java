package hus.oop.lab9.exercise2.ex3;

import java.util.Objects;

/**
 * An abstract class providing an implementation for shared parts of ArrayPoly and ListPoly.
 */
public abstract class AbstractPoly implements Poly {
    double[] derive() {
        double[] coefficients = coefficients();
        double[] derivedCoefficients = new double[coefficients.length - 1];
        for (int i = 1; i < coefficients.length; i++) {
            derivedCoefficients[i - 1] = coefficients[i] * i;
        }
        return derivedCoefficients;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Poly)) return false;
        Poly poly = (Poly) o;
        return Objects.equals(coefficients(), poly.coefficients());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(coefficients());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        double[] coefficients = coefficients();
        for (int i = coefficients.length - 1; i >= 0; i--) {
            if (coefficients[i] != 0) {
                if (sb.length() > 0) {
                    sb.append(" + ");
                }
                sb.append(coefficients[i]);
                if (i > 0) {
                    sb.append("x^").append(i);
                }
            }
        }
        return sb.toString();
    }
}

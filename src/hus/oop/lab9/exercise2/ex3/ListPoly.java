package hus.oop.lab9.exercise2.ex3;

import java.util.ArrayList;
import java.util.List;

/**
 * Class representing a polynomial with coefficients stored as a list.
 */
public class ListPoly extends AbstractPoly {
    private final List<Double> coefficients;

    public ListPoly(double[] coeffs) {
        coefficients = new ArrayList<>();
        for (double coeff : coeffs) {
            coefficients.add(coeff);
        }
    }

    @Override
    public int degree() {
        return coefficients.size() - 1;
    }

    @Override
    public Poly derivative() {
        double[] derivedCoefficients = derive();
        return new ListPoly(derivedCoefficients);
    }

    @Override
    public double coefficient(int degree) {
        if (degree < 0 || degree >= coefficients.size()) {
            throw new IllegalArgumentException("Invalid degree: " + degree);
        }
        return coefficients.get(degree);
    }

    @Override
    public double[] coefficients() {
        double[] coeffsArray = new double[coefficients.size()];
        for (int i = 0; i < coefficients.size(); i++) {
            coeffsArray[i] = coefficients.get(i);
        }
        return coeffsArray;
    }
}

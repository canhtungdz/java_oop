package hus.oop.lab9.exercise2.ex3;

/**
 * Interface representing a polynomial with arbitrary grade.
 */
public interface Poly {
    /**
     * Returns the degree of the polynomial.
     * @return the degree of the polynomial.
     */
    int degree();

    /**
     * Returns a new polynomial which is the derivative of the current object.
     * @return a new polynomial which is the derivative of the current object.
     */
    Poly derivative();

    /**
     * Returns the coefficient of the monomial with the specified degree.
     * @param degree The degree to be queried (get the coefficient).
     * @return The coefficient of the monomial with the specified degree.
     */
    double coefficient(int degree);

    /**
     * Returns a double[] containing all the coefficients.
     * @return A double[] containing all the coefficients.
     */
    double[] coefficients();
}

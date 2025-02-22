package hus.oop.lab9.exercise2.ex3;

/**
 * Develop two classes, namely ArrayPoly and ListPoly, for managing polynomials.
 * More specifically, the two classes must exhibit the same functionalities (they both implement the Poly interface) but using different mechanisms internally.
 */
public class TestApp {
    public static void main(String[] args) {
        Poly ap = new ArrayPoly(new double[]{1, 3, 4, 8});
        Poly lp = new ListPoly(new double[]{1, 3, 4, 8});

        System.out.println("ap = " + ap);
        System.out.println("lp = " + lp);

        if (ap.equals(lp) && lp.equals(ap))
            System.out.println("ap == lp");
        else
            System.out.println("ap != lp");

        ap = ap.derivative();
        System.out.println("ap' = " + ap.toString());

        ap = ap.derivative();
        System.out.println("ap'' = " + ap.toString());

        lp = lp.derivative();
        System.out.println("lp' = " + lp.toString());

        lp = lp.derivative();
        System.out.println("lp'' = " + lp.toString());
    }
}

package hus.oop.lab9.exercise2.ex1;



public abstract class MyAbstractList implements MyList {

    public void checkBoundaries(int index, int limit) throws ArrayIndexOutOfBoundsException {
        if (index < 0 || index > limit) {
            throw new ArrayIndexOutOfBoundsException("");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size(); i++) {
            sb.append(String.format("[%s]", get(i).toString()));
        }
        return sb.toString();
    }
}

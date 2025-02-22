package hus.oop.lab6.exercise1.animal;

public class TestCat {
    public static void main(String[] args) {
        Animal animal1 = new Cat("GalaxyCat");
        ((Cat)animal1).greets();
        System.out.println(animal1.toString());
    }
}

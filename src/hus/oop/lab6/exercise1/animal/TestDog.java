package hus.oop.lab6.exercise1.animal;

public class TestDog {
    public static void main(String[] args) {
        Animal animal2 = new Dog("GalaxyDog");
        ((Dog)animal2).greets();
        System.out.println();
        ((Dog)animal2).greets(new Dog("MoonDog"));
        System.out.println(animal2.toString());
    }
}

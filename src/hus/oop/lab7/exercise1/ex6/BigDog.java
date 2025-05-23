package hus.oop.lab7.exercise1.ex6;

public class BigDog extends Dog{
    public BigDog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Woow");
    }

    @Override
    public void greets(Dog another) {
        System.out.println("Wooooow");
    }
    public void greets(BigDog another) {
        System.out.println("Woooooooooow");
    }
}

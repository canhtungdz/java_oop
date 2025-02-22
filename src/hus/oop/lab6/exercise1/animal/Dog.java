package hus.oop.lab6.exercise1.animal;

public class Dog extends Mammal{
    public Dog(String name) {
        super(name);
    }
    public void greets() {
        System.out.print("Woof");
    }
    public void greets(Dog another) {
        System.out.println("Woooof");
    }
    public String toString() {
        return "Dog[" + super.toString() +
                "]";
    }
}

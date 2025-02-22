package hus.oop.lab7.exercise1.ex6;

public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }
    abstract void greets();
}

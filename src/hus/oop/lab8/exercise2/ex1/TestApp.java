package hus.oop.lab9.exercise2.ex1;

public class TestApp {

    public static void main(String[] args) {
        MyList list = new MyLinkedList();
        list.add("A", 0);
        list.add("B");
        list.add("C");
        list.add("D", 0);
        list.add("E", 3);
        System.out.println(list.size());
        System.out.println(list);
    }
}

package hus.oop.lab9.exercise2.ex1;

public class MyLinkedList extends MyAbstractList {
    private MyLinkedListNode head;
    private int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    private MyLinkedListNode getNode(int index) {
        MyLinkedListNode current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current;
    }

    @Override
    public void add(Object element) {
        add(element, size);
    }

    @Override
    public void add(Object element, int idx) {
        checkBoundaries(idx, size);
        if (idx == 0) {
            head = new MyLinkedListNode(element, head);
        } else {
            MyLinkedListNode prev = getNode(idx - 1);
            prev.setNext(new MyLinkedListNode(element, prev.getNext()));
        }
        size++;
    }

    public Object get(int index) {
        checkBoundaries(index, size);
        return getNode(index).getPayload();
    }

    @Override
    public void remove(int index) {
        checkBoundaries(index, size);
        if (index == 0) {
            head = head.getNext();
        } else {
            MyLinkedListNode prev = getNode(index - 1);
            prev.setNext(prev.getNext().getNext());
        }
        size--;
    }

    @Override
    public int size() {
        return size;
    }
}

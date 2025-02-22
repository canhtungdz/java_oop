package hus.oop.lab8.exercise1;

import java.util.*;
public class Lists {
    public static void insertFirst(List<Integer> list, int value) {
        list.add(0, value);
    }
    public static void insertLast(List<Integer> list, int value) {
        list.add(value);
    }
    public static void replaceThird(List<Integer> list, int value) {
        list.set(2, value);
    }
    public static void removeThird(List<Integer> list) {
        list.remove(2);
    }
    public static void removeEvil(List<Integer> list) {
        while (list.contains(666)) {
            list.remove((Integer) 666);
        }
    }
    public static List<Integer> generateSquare() {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i*i);
        }
        return list;
    }
    public static boolean contains(List<Integer> list, int value) {
        return list.contains(value);
    }
    public static void copy(List<Integer> source, List<Integer> target) {
        target.clear();
        for (Integer i : source) {
            target.add((Integer) i);
        }
    }
    public static void reverse(List<Integer> list) {
        Collections.reverse(list);
    }
    public static void reverseManual(List<Integer> list) {
        for (int i = 0; i <= list.size()/2; i++) {
            Integer temp = list.get(i);
            list.set(i, list.size() - i - 1);
            list.set(list.size() - i - 1, temp);
        }
    }
    public static void insertBeginningEnd(LinkedList<Integer> list, int value) {
        list.addFirst(value);
        list.addLast(value);
    }


}

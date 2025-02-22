package hus.oop.lab8.exercise2;

import java.util.*;

public class Sets {
    public static Set<Integer> intersectionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> interSet = new HashSet<>();
        for (Integer i : first) {
            for (Integer j : second) {
                if (Objects.equals(i, j)) {
                    interSet.add(i);
                    break;
                }
            }
        }
        return interSet;
    }
    public static Set<Integer> unionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> unionSet = new HashSet<>();
        for (Integer i : first) {
            unionSet.add(i);
        }
        for (Integer i : second) {
            unionSet.add(i);
        }
        return unionSet;
    }
    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
        Set<Integer> intersectionSet = new HashSet<>(first);
        intersectionSet.retainAll(second);
        return intersectionSet;
    }
    public static Set<Integer> union(Set<Integer> first, Set<Integer> second) {
        Set<Integer> unionSet = new HashSet<>();
        unionSet.addAll(first);
        unionSet.addAll(second);
        return unionSet;
    }
    public static List<Integer> toList(Set<Integer> source) {
        List<Integer> list = new ArrayList<>();
        list = source.stream().toList();
        return list;
    }
    public static List<Integer> removeDuplicates(List<Integer> source) {
        Set<Integer> set = new HashSet<>(source);
        source = set.stream().toList();
        return source;
    }
    public static List<Integer> removeDuplicatesManual(List<Integer> source) {
        List<Integer> removedList = new ArrayList<>();
        for (Integer i : source) {
            if (!removedList.contains(i)) {
                removedList.add(i);
            }
        }
        return removedList;
    }
    public static Character firstRecurringCharacter(String s) {
        Set<Character> character = new HashSet<>();
        for (int i = 0; i < s.length(); i ++) {
            if (character.contains(s.charAt(i))) {
                return s.charAt(i);
            } else {
                character.add(s.charAt(i));
            }
        }
        return null;
    }
    public static Set<Character> allRecurringChars(String s) {
        Set<Character> characters = new HashSet<>();
        Set<Character> reccurred = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (characters.contains(s.charAt(i))) {
                reccurred.add(s.charAt(i));
            } else {
                characters.add(s.charAt(i));
            }
        }
        return reccurred;
    }
    public static Integer[] toArray(Set<Integer> source) {
        return source.toArray(new Integer[0]);
    }
    public static int getFirst(TreeSet<Integer> source) {
        return source.first();
    }
    public static int getLast(TreeSet<Integer> source) {
        return source.last();
    }
    public static int geGreater(TreeSet<Integer> source, int value) {
        return source.higher(value) == null ? Integer.MIN_VALUE : source.higher(value);
    }

}

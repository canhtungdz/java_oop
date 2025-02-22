package hus.oop.lab8.exercise3;

import java.util.*;
public class Maps {
    public static int count(Map<Integer, Integer> map) {
        return map.size();
    }
    public static void empty(Map<Integer, Integer> map) {
        map.clear();
    }
    public static boolean contains(Map<Integer, Integer> map, int key) {
        return map.containsKey(key);
    }
    public static boolean containsKeyValue(Map<Integer, Integer> map, int key, int value) {
        return map.containsKey(key) && map.containsKey(value);
    }
    public static Set<Integer> keySet(Map<Integer, Integer> map) {
        return map.keySet();
    }
    public static Collection<Integer> values(Map<Integer, Integer> map) {
        return map.values();
    }
    public static String getColor(int value) {
        Map<Integer, String> colors = new HashMap<>();
        colors.put(0, "black");
        colors.put(1, "while");
        colors.put(2, "red");
        return colors.get(value);
    }

}

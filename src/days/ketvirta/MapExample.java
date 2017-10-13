package days.ketvirta;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.BiConsumer;

/**
 * Created by andriusbaltrunas on 10/13/2017.
 */
public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> persons = new HashMap<>();
        Map<Integer, String> persons2 = new LinkedHashMap<>();
        Map<Integer, String> persons3 = new TreeMap<>();

        putItems(persons);
        putItems(persons2);
        putItems(persons3);
        System.out.println("**HashMap***");
        printMap(persons);
        System.out.println("**LinkedHashMap***");
        printMap(persons2);
        System.out.println("***TreeMap***");
        printMap(persons3);
    }

    private static void putItems(Map<Integer, String> map) {
        map.put(99, "Jonas");
        map.put(100, "Andrius");
        map.put(12, "Jonas");
        map.put(3, "Kazys");
        map.put(99, "Maryte");
    }

    private static void printMap(Map<Integer, String> map) {
        map.forEach((key, val) ->
                        System.out.println("key:" + key + " val: " + val)
        );
    }
}

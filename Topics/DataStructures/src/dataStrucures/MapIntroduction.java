package dataStrucures;

import java.util.HashMap;

public class MapIntroduction {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        printIsMapEmpty(map);

        map.put(97, "a");
        map.put(98, "b");
        map.put(99, "c");
        map.put(65, "A");
        map.put(66, "B");
        map.put(677, "C");

        printKeySet(map);
        printEveryValue(map);

        map.put(68, "D");

        printSizeOfMap(map);
        printValueByKey(map, 99);
        removeElementByKey(map, 97);
        printIsKeyInTheMap(map, 100);
        clearMap(map);
        printSizeOfMap(map);
        printMapContents(map);
    }

    private static void clearMap(HashMap<Integer, String> map) {
        map.clear();
    }

    private static void printIsKeyInTheMap(HashMap<Integer, String> map, int key) {
        if (map.containsKey(key)) {
            System.out.println("Key " + key + " exists in the map");
        } else {
            System.out.println("Key " + key + " does not exist in them map");
        }
    }

    private static void printMapContents(HashMap<Integer, String> map) {
        System.out.println(map);
    }

    private static void removeElementByKey(HashMap<Integer, String> map, int key) {
        map.remove(key);
    }

    private static void printValueByKey(HashMap<Integer, String> map, int key) {
        System.out.println(map.get(key));
    }

    private static void printSizeOfMap(HashMap<Integer, String> map) {
        System.out.println(map.size());
    }

    private static void printIsMapEmpty(HashMap<Integer, String> map) {
        System.out.println("Is the map empty: " + map.isEmpty());
    }

    private static void printKeySet(HashMap<Integer, String> map) {
        System.out.println(map.keySet());
    }

    private static void printEveryValue(HashMap<Integer, String> map) {
        System.out.println(map.values());
    }
}
//# Map introduction 1
//
//        We are going to play with maps. Feel free to use the built-in methods where
//        possible.
//
//        - Create an empty map where the keys are integers and the values are characters
//        - Print out whether the map is empty or not
//        - Add the following key-value pairs to the map
//        |  Key | Value |
//        | :--- | :---- |
//        | 97   | a     |
//        | 98   | b     |
//        | 99   | c     |
//        | 65   | A     |
//        | 66   | B     |
//        | 67   | C     |
//        - Print all the keys
//        - Print all the values
//        - Add value D with the key 68
//        - Print how many key-value pairs are in the map
//        - Print the value that is associated with key 99
//        - Remove the key-value pair with key 97 and print the associated value
//        - Print whether there is an associated value with key 100 or not
//        - Remove all the key-value pairs
//        - Print how many key-value pairs are in the map
//
//        The full output of your `main` method should be the following:
//
//        ```text
//        true
//        [97, 65, 98, 66, 99, 67]
//        [a, A, b, B, c, C]
//        7
//        c
//        false
//        0
//        ```
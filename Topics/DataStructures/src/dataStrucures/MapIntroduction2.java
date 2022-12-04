package dataStrucures;

import java.util.HashMap;

public class MapIntroduction2 {
    public static void main(String[] args) {
        HashMap<String, String> books = new HashMap<>();
        books.put("978-1-60309-452-8", "A Letter to Jo");
        books.put("978-1-60309-459-7", "Lupus ");
        books.put("978-1-60309-444-3", "Red Panda and Moon Bear");
        books.put("978-1-60309-461-0", "The Lab");

        printAllKeyValuePairs(books);
        removeKeyValuePairFromMapByKey(books, "978-1-60309-444-3");
        removeKeyValuePairFromMapByValue(books, "The Lab");

        books.put("978-1-60309-450-4", "They Called Us Enemy");
        books.put("978-1-60309-453-5", "Why Did We Trust Him?");

        printIsMapContainsValue(books, "478-0-61159-424-8");
        printValueByKey(books, "978-1-60309-453-5");
    }

    private static void printValueByKey(HashMap<String, String> map, String key) {
        System.out.println(map.get(key));
    }

    private static void printIsMapContainsValue(HashMap<String, String> map, String value) {
        if (map.containsValue(value)) {
            System.out.println("Tha map contains this value: " + value);
        } else {
            System.out.println("The map does not contains this value: " + value);
        }
    }

    private static void printAllKeyValuePairs(HashMap<String, String> map) {
        for (String bookKey : map.keySet()) {
            System.out.println(map.get(bookKey) + " (ISBN: " + bookKey + ")");
        }
    }

    private static void removeKeyValuePairFromMapByKey(HashMap<String, String> map, String key) {
        map.remove(key);
    }

    private static void removeKeyValuePairFromMapByValue(HashMap<String, String> map, String value) {
        map.values().remove(value);
    }
}

//# Map introduction 2
//
//        - Create a map where the keys are strings and the values are strings with the
//        following initial values
//        | Key               | Value                   |
//        | :---------------- | :---------------------- |
//        | 978-1-60309-452-8 | A Letter to Jo          |
//        | 978-1-60309-459-7 | Lupus                   |
//        | 978-1-60309-444-3 | Red Panda and Moon Bear |
//        | 978-1-60309-461-0 | The Lab                 |
//
//        - Print all the key-value pairs in the following format
//        ```text
//        A Letter to Jo (ISBN: 978-1-60309-452-8)
//        Lupus (ISBN: 978-1-60309-459-7)
//        Red Panda and Moon Bear (ISBN: 978-1-60309-444-3)
//        The Lab (ISBN: 978-1-60309-461-0)
//        ```
//        - Remove the key-value pair with key 978-1-60309-444-3
//        - Remove the key-value pair with value The Lab
//        - Add the following key-value pairs to the map
//        | Key               | Value                 |
//        | :---------------- | :-------------------- |
//        | 978-1-60309-450-4 | They Called Us Enemy  |
//        | 978-1-60309-453-5 | Why Did We Trust Him? |
//
//        - Print whether there is an associated value with key 478-0-61159-424-8 or not
//        - Print the value associated with key 978-1-60309-453-5
//
//        The full output of your `main` method should be the following:
//
//        ```text
//        A Letter to Jo (ISBN: 978-1-60309-452-8)
//        Red Panda and Moon Bear (ISBN: 978-1-60309-444-3)
//        Lupus (ISBN: 978-1-60309-459-7)
//        The Lab (ISBN: 978-1-60309-461-0)
//        false
//        Why Did We Trust Him?
//        ```
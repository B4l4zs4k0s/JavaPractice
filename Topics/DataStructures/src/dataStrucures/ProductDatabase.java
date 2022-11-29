package dataStrucures;

import java.security.Key;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ProductDatabase {
    public static void main(String[] args) {
        howMuchIsTheFish(productsDatabase());
        mostExpensiveProduct(productsDatabase());
        averagePrice(productsDatabase());
        pricesBelow300(productsDatabase());
        isThereAnythingFor125(productsDatabase());
        cheapestProduct(productsDatabase());
    }

    private static HashMap<String, Integer> productsDatabase() {
        HashMap<String, Integer> database = new HashMap<>();
        database.put("Eggs", 200);
        database.put("Milk", 200);
        database.put("Fish", 400);
        database.put("Apples", 150);
        database.put("Bread", 50);
        database.put("Chicken", 550);
        return database;
    }

    private static void howMuchIsTheFish(HashMap<String, Integer> productsDatabase) {
        for (Map.Entry<String, Integer> entry : productsDatabase.entrySet()) {
            if (entry.getKey().equals("Fish")) {
                System.out.println(entry.getValue());
            }
        }
    }

    private static void mostExpensiveProduct(HashMap<String, Integer> productsDatabase) {
        int maxValueInMap = (Collections.max(productsDatabase.values()));
        for (Map.Entry<String, Integer> entry : productsDatabase.entrySet()) {
            if (entry.getValue() == maxValueInMap) {
                System.out.println(entry.getKey());
            }
        }
    }

    private static void averagePrice(HashMap<String, Integer> productsDatabase) {
        double avg = 0;
        for (Map.Entry<String, Integer> entry : productsDatabase.entrySet()) {
            avg += entry.getValue();
        }
        System.out.println(avg / productsDatabase.size());
    }

    private static void pricesBelow300(HashMap<String, Integer> productsDatabase) {
        int pB300 = 0;
        for (Map.Entry<String, Integer> entry : productsDatabase.entrySet()) {
            if (entry.getValue() < 300) {
                pB300++;
            }
        }
        System.out.println(pB300);
    }

    private static void isThereAnythingFor125(HashMap<String, Integer> productsDatabase) {
        int itemsFor125 = 0;
        for (Map.Entry<String, Integer> entry : productsDatabase().entrySet()) {
            if (entry.getValue() == 125) {
                itemsFor125++;
            }
        }
        if (itemsFor125 > 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
    private static void cheapestProduct(HashMap<String, Integer> productsDatabase) {
        int minValue = (Collections.min(productsDatabase.values()));
        for (Map.Entry<String, Integer> entry : productsDatabase.entrySet()) {
            if (entry.getValue() == minValue) {
                System.out.println(entry.getKey());
            }
        }
    }
}
//# Product database
//
//We are going to represent our products in a map where the keys are strings
//representing the product's name and the values are numbers representing the
//product's price.
//
//- Create a `products` map with the following key-value pairs:
//
//  | Product name (key) | Price (value) |
//  | :----------------- | :------------ |
//  | Eggs               | 200           |
//  | Milk               | 200           |
//  | Fish               | 400           |
//  | Apples             | 150           |
//  | Bread              | 50            |
//  | Chicken            | 550           |
//
//- Create an application which prints out the answers to the following
//  questions:
//  - [How much is the fish?](https://www.youtube.com/watch?v=cbB3iGRHtqA)
//  - What is the most expensive product?
//  - What is the average price?
//  - How many products' price is below 300?
//  - Is there anything we can buy for exactly 125?
//  - What is the cheapest product?
//
//The full output of your `main` method should be the following:
//
//```text
//400
//Chicken
//258.33334
//4
//no
//Bread
//```
//
//## Autograder Bonus
//
//- Java: make the products map a class constant (declared as `static
//final`)
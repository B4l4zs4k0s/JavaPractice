package dataStrucures;

import java.util.HashMap;
import java.util.Map;

public class ProductDatabase2 {
    public static void main(String[] args) {

        productsLessThan201(productsDatabase());
        productsMoreThan150(productsDatabase());
    }

    private static HashMap<String, Integer> productsDatabase() {
        HashMap<String, Integer> products = new HashMap<>();
        products.put("Eggs", 200);
        products.put("Milk", 200);
        products.put("Fish", 400);
        products.put("Apples", 150);
        products.put("Bread", 50);
        products.put("Chicken", 550);
        return products;
    }

    private static void productsLessThan201(HashMap<String, Integer> productsDatabase) {
        for (Map.Entry<String, Integer> entry : productsDatabase.entrySet()) {
            if (entry.getValue() < 201) {
                System.out.println(entry.getKey());
            }
        }
    }
    private static void productsMoreThan150(HashMap<String, Integer> productsDatabase) {
        for (Map.Entry<String, Integer> entry : productsDatabase.entrySet()) {
            if (entry.getValue() > 150) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}
//# Product database 2
//
//We are going to represent our products in a map where the keys are strings
//representing the product's name and the values are numbers representing the
//product's price.
//
//- Create a map with the following key-value pairs:
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
//  - Which products cost less than 201? (just the name)
//  - Which products cost more than 150? (name + price)
//
//The full output of your `main` method should be the following:
//
//```text
//Apples
//Eggs
//Milk
//Bread
//Fish 400
//Chicken 550
//Eggs 200
//Milk 200
//```
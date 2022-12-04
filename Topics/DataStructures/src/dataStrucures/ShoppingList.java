package dataStrucures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShoppingList {
    public static void main(String[] args) {
        printAnswers();
    }

    private static void printAnswers() {
        isThisItemIsOnTheList("milk");
        isThisItemIsOnTheList("bananas");
    }

    private static List<String> list() {
        List<String> list = new ArrayList<>(Arrays.asList("eggs", "milk", "fish", "apples", "bread", "chicken"));

        return list;
    }

    private static void isThisItemIsOnTheList(String string) {
        if (list().contains(string)) {
            System.out.println("Do we have " + string + " on the shopping list: yes");
        } else {
            System.out.println("Do we have " + string + " on the shopping list: no");
        }
    }
}
//# Shopping list
//
//We are going to represent a shopping list by a list containing strings.
//
//- Create a list with the following items:
//  - `eggs`, `milk`, `fish`, `apples`, `bread` and `chicken`
//- Create an application which prints out the answers to the following
//  questions:
//  - Do we have `milk` in the shopping list? (yes/no)
//  - Do we have `bananas` in the shopping list? (yes/no)
//
//The full output of your `main` method should be the following:
//
//```text
//yes
//no
//```
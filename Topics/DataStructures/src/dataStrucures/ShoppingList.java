package dataStrucures;

import java.util.ArrayList;
import java.util.List;

public class ShoppingList {
    public static void main(String[] args) {

        isThisItemIsOnTheList("milk");
        isThisItemIsOnTheList("bananas");
    }

    private static List<String> list() {
        List<String> list = new ArrayList<>();
        list.add("eggs");
        list.add("milk");
        list.add("fish");
        list.add("apples");
        list.add("bread");
        list.add("chicken");
        return list;
    }

    private static void isThisItemIsOnTheList(String string) {
        if (list().contains(string)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
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
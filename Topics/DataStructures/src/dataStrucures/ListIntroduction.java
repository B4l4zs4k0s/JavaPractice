package dataStrucures;

import java.util.ArrayList;
import java.util.List;

public class ListIntroduction {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        System.out.println(names.size());
        System.out.println("=========================================");
        names.add("William");
        System.out.println("Is the list empty: " + names.isEmpty());
        System.out.println("=========================================");
        names.add("John");
        names.add("Amanda");
        System.out.println(names.size());
        System.out.println("=========================================");
        System.out.println(names.get(2));
        System.out.println("=========================================");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}
//# List introduction 1
//
//        We are going to play with lists. Feel free to use the built-in methods where
//        possible.
//
//        - Create an empty list which will contain names (strings)
//        - Print out the number of elements in the list
//        - Add "William" to the list
//        - Print out whether the list is empty or not
//        - Add "John" to the list
//        - Add "Amanda" to the list
//        - Print out the number of elements in the list
//        - Print out the 3rd element
//        - Iterate through the list and print out each name
//        ```text
//        William
//        John
//        Amanda
//        ```
//        - Iterate through the list and print
//        ```text
//        1. William
//        2. John
//        3. Amanda
//        ```
//        - Remove the 2nd element
//        - Iterate through the list in a reversed order and print out each name
//        ```text
//        Amanda
//        William
//        ```
//        - Remove all elements
//        - Print out the number of elements in the list
//
//        The full output of your `main` method should be the following:
//
//        ```text
//        0
//        false
//        3
//        Amanda
//        William
//        John
//        Amanda
//        1. William
//        2. John
//        3. Amanda
//        Amanda
//        William
//        0
//        ```
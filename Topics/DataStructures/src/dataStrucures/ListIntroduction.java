package dataStrucures;

import java.util.ArrayList;
import java.util.List;

public class ListIntroduction {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        printListSize(names);
        printGapForConsoleVisibility();
        addNameToList(names, "William");
        printIfListIsEmpty(names);
        printGapForConsoleVisibility();
        addNameToList(names, "John");
        addNameToList(names, "Amanda");
        printListSize(names);
        printGapForConsoleVisibility();
        printElementByIndex(names, 2);
        printGapForConsoleVisibility();
        printNames(names);
        removeElementByIndex(names, 1);
        printListInReverse(names);
    }

    private static void addNameToList(List<String> list, String name) {
        list.add(name);
    }

    private static void printNames(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    private static void printGapForConsoleVisibility() {
        System.out.println("========================");
    }

    private static void printListSize(List<String> list) {
        System.out.println(list.size());
    }

    private static void printElementByIndex(List<String> list, int index) {
        System.out.println(list.get(index));
    }

    private static void printIfListIsEmpty(List<String> list) {
        System.out.println("Is the list empty: " + list.isEmpty());
    }

    private static void removeElementByIndex(List<String> list, int index) {
        list.remove(index);
    }

    private static void printListInReverse(List<String> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
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
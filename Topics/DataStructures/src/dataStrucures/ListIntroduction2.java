package dataStrucures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListIntroduction2 {
    public static void main(String[] args) {
        List<String> listA = returnListA();
        List<String> listB = returnListB(listA);
        returnListB(returnListA());
        printIsContainsElement(listA, "Durian");
        listB.remove("Durian");
        listA.add("Kiwifruit");
        compareSizeOfLists(listA, listB);
        printIndexByValue(listA, "Avocado");
        printIndexByValue(listB, "Durian");
        listB.add("Passion Fruit");
        listB.add("Pomelo");
        System.out.println(listA.get(2));
        printAllElementOfTheList(listA);
        printAllElementOfTheList(listB);
    }

    private static List<String> returnListA() {
        List<String> listA = new ArrayList<>(Arrays.asList("Apple", "Avocado", "Blueberries", "Durian", "Lychee"));
        return listA;
    }

    private static List<String> returnListB(List<String> list) {
        ArrayList<String> listB = new ArrayList<>(list);
        return listB;
    }

    private static void printIsContainsElement(List<String> list, String value) {
        System.out.println(list.contains(value));
    }

    private static void printIndexByValue(List<String> list, String value) {
        if (list.contains(value)) {
            System.out.println("The index of " + value + " is: " + list.indexOf(value));
        } else {
            System.out.println(value + " is not on the list");
        }
    }

    private static void compareSizeOfLists(List<String> list1, List<String> list2) {
        if (list1.size() > list2.size()) {
            System.out.println("The size difference between the lists is:  " + (list1.size() - list2.size()));
        } else {
            System.out.println("The size difference between the lists is:  " + (list2.size() - list1.size()));
        }
    }

    private static void printAllElementOfTheList(List<String> list) {
        System.out.println(list);
    }
}
//# List introduction 2
//
//        - Create a list ('`List A`') which contains the following values
//        ```text
//        Apple, Avocado, Blueberries, Durian, Lychee
//        ```
//        - Create a new list ('`List B`') with the values of `List A`
//        - Print out whether `List A` contains "Durian" or not
//        - Remove "Durian" from `List B`
//        - Add "Kiwifruit" to `List A` after the 4th element
//        - Compare the size of `List A` and `List B`
//        - Get the index of "Avocado" from `List A`
//        - Get the index of "Durian" from `List B`
//        - Add "Passion Fruit" and "Pomelo" to `List B` in a single statement
//        - Print out the 3rd element from `List A`
//        - Print all elements of `List A`
//        - Print all elements of `List B`
//
//        The full output of your `main` method should be the following:
//
//        ```text
//        true
//        false
//        1
//        -1
//        Blueberries
//        [Apple, Avocado, Blueberries, Durian, Kiwifruit, Lychee]
//        [Apple, Avocado, Blueberries, Lychee, Passion Fruit, Pomelo]
//        ```
package dataStrucures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PersonalFinance {
    public static void main(String[] args) {
        printSumMaxMinAvgValuesOfList(returnList());
    }

    private static List<Integer> returnList() {
        List<Integer> expenses = new ArrayList<>(Arrays.asList(500, 1000, 1250, 175, 800, 120));
        return expenses;
    }

    private static void printSumMaxMinAvgValuesOfList(List<Integer> list) {
        System.out.println(returnSumResultOfElementsOfList(list));
        System.out.println(returnMostExpensiveItemOfList(list));
        System.out.println(returnLeastExpensiveItemOfList(list));
        System.out.println(returnAverageSpendingByList(list, returnSumResultOfElementsOfList(list)));

    }

    private static double returnSumResultOfElementsOfList(List<Integer> list) {
        double sum = 0;
        for (int n : list) {
            sum += n;
        }
        return sum;
    }

    private static double returnMostExpensiveItemOfList(List<Integer> list) {
        return Collections.max(list);
    }

    private static double returnLeastExpensiveItemOfList(List<Integer> list) {
        return Collections.min(list);
    }

    private static double returnAverageSpendingByList(List<Integer> list, double sum) {
        return sum / list.size();
    }
}
//# Personal finance
//
//        We are going to represent our expenses in a list containing integers.
//
//        - Create a list with the following items:
//        - 500, 1000, 1250, 175, 800 and 120
//        - Create an application which prints out the answers to the following
//        questions:
//        - How much did we spend?
//        - Which was our greatest expense?
//        - Which was our cheapest spending?
//        - What was the average amount of our spendings? (print this as a float value)
//
//        The full output of your `main` method should be the following:
//
//        ```text
//        3845
//        1250
//        120
//        640.8333
//        ```
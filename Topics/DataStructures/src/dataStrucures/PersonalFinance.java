package dataStrucures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonalFinance {
    public static void main(String[] args) {
        List<Integer> expenses = new ArrayList<>();
        expenses.add(500);
        expenses.add(1000);
        expenses.add(1250);
        expenses.add(175);
        expenses.add(800);
        expenses.add(120);

        double sum = 0;
        for (int n : expenses) {
            sum += n;
        }
        System.out.println(sum);
        System.out.println(Collections.max(expenses));
        System.out.println(Collections.min(expenses));
        System.out.println(sum / expenses.size());
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
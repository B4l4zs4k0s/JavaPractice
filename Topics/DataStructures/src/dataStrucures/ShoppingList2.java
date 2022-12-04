package dataStrucures;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ShoppingList2 {
    public static void main(String[] args) {
        printAnswers();
    }

    private static void printAnswers(){
        System.out.println(sumSpending(priceList(), listOfBob()));
        System.out.println(sumSpending(priceList(), listOfAlice()));
        whoBuysMoreFrom("Rice", listOfBob(), listOfAlice());
        whoBuysMoreFrom("Potato", listOfBob(), listOfAlice());
        whoBuysMoreFrom("Ham", listOfBob(), listOfAlice());
        whoBuysMoreFrom("Apples", listOfBob(), listOfAlice());
        whoBuysMoreKindsOfProducts(listOfBob(), listOfAlice());
        whoBuysMoreItems(listOfBob(),listOfAlice());
    }

    private static HashMap<String, Double> priceList() {
        HashMap<String, Double> listOfPrices = new HashMap<>();
        listOfPrices.put("Milk", 1.07);
        listOfPrices.put("Rice", 1.59);
        listOfPrices.put("Eggs", 3.14);
        listOfPrices.put("Cheese", 12.60);
        listOfPrices.put("Chicken breast", 9.40);
        listOfPrices.put("Apples", 2.31);
        listOfPrices.put("Tomato", 2.58);
        listOfPrices.put("Potato", 1.75);
        listOfPrices.put("Onion", 1.10);
        return listOfPrices;
    }

    private static HashMap<String, Integer> listOfBob() {
        HashMap<String, Integer> listOfBob = new HashMap<>();
        listOfBob.put("Milk", 3);
        listOfBob.put("Rice", 2);
        listOfBob.put("Eggs", 2);
        listOfBob.put("Cheese", 1);
        listOfBob.put("Chicken breast", 4);
        listOfBob.put("Apples", 1);
        listOfBob.put("Tomato", 2);
        listOfBob.put("Potato", 1);
        return listOfBob;
    }

    private static HashMap<String, Integer> listOfAlice() {
        HashMap<String, Integer> listOfAllice = new HashMap<>();
        listOfAllice.put("Rice", 1);
        listOfAllice.put("Eggs", 5);
        listOfAllice.put("Chicken breast", 2);
        listOfAllice.put("Apples", 1);
        listOfAllice.put("Tomato", 10);
        return listOfAllice;
    }

    private static double sumSpending(HashMap<String, Double> priceList, HashMap<String, Integer> list) {
        double sum = 0;
        for (Map.Entry<String, Integer> item : list.entrySet()) {
            sum += item.getValue() * priceList.get(item.getKey());
        }
        return sum;
    }

    private static void whoBuysMoreFrom(String product, HashMap<String, Integer> listBob, HashMap<String, Integer> listAlice) {
        int amountBob = 0;
        int amountAlice = 0;
        for (Map.Entry<String, Integer> item : listBob.entrySet()) {
            if (!listBob.containsKey(product)) {
                amountBob = 0;
            } else {
                if (Objects.equals(product, item.getKey()))
                    amountBob += listBob.get(product);
            }
        }
        for (Map.Entry<String, Integer> item : listAlice.entrySet()) {
            if (!listAlice.containsKey(product)) {
                amountAlice = 0;
            } else {
                if (Objects.equals(product, item.getKey()))
                    amountAlice += listAlice.get(product);
            }
        }

        if (amountBob > amountAlice) {
            System.out.println("Bob");
        }
        if (amountAlice > amountBob) {
            System.out.println("Alice");
        }
        if (amountBob == amountAlice) {
            System.out.println("no one");
        }
    }

    private static void whoBuysMoreKindsOfProducts(HashMap<String, Integer> listBob, HashMap<String, Integer> listAlice) {
        int alice = listAlice.size();
        int bob = listBob.size();

        if (alice > bob) {
            System.out.println("Alice");
        } else {
            System.out.println("Bob");
        }
    }

    private static void whoBuysMoreItems(HashMap<String, Integer> listBob, HashMap<String, Integer> listAlice) {
        int amountBob = 0;
        int amountAlice = 0;
        for (Map.Entry<String, Integer> item : listBob.entrySet()) {
            amountBob += item.getValue();
        }

        for (Map.Entry<String, Integer> item : listAlice.entrySet()) {
            amountAlice += item.getValue();
        }
        if (amountBob > amountAlice) {
            System.out.println("Bob");
        }
        if (amountAlice > amountBob) {
            System.out.println("Alice");
        }
    }
}
//        Represent the following products with their prices:
//
//        Product	Price
//        Milk	1.07
//        Rice	1.59
//        Eggs	3.14
//        Cheese	12.60
//        Chicken Breasts	9.40
//        Apples	2.31
//        Tomato	2.58
//        Potato	1.75
//        Onion	1.10

//        Represent Bob's shopping list:
//
//        Product	Amount
//        Milk	3
//        Rice	2
//        Eggs	2
//        Cheese	1
//        Chicken Breasts	4
//        Apples	1
//        Tomato	2
//        Potato	1

//        Represent Alice's shopping list:
//
//        Product	Amount
//        Rice	1
//        Eggs	5
//        Chicken Breasts	2
//        Apples	1
//        Tomato	10

//        Create an application which prints out the answers to the following questions:
//
//        How much does Bob pay?
//        How much does Alice pay?
//        Who buys more Rice?
//        Who buys more Potato?
//        Who buys more Ham?
//        Who buys more Apples?
//        Who buys more of different products?
//        Who buys more items? (more pieces)
//        The full output of your main method should be the following:
//
//        72.09
//        64.2
//        Bob
//        Bob
//        no one
//        no one
//        Bob
//        Alice
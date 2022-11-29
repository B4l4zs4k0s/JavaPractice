package dataStrucures;

import java.util.HashMap;
import java.util.Map;

public class TelephoneBook {
    public static void main(String[] args) {
        printJohnsNumber();
        whoseIsThisNumber();
        findIfNumberExist();
    }

    private static HashMap<String, String> phonebook() {
        HashMap<String, String> contacts = new HashMap<>();
        contacts.put("William A. Lathan", "405-709-1865");
        contacts.put("John K. Miller", "402-247-8568");
        contacts.put("Brooke P. Askew", "307-687-2982");
        contacts.put("Hortensia E. Foster", "606-481-6467");
        contacts.put("Amanda D. Newland", "319-243-5613");
        return contacts;
    }

    private static void printJohnsNumber() {
        System.out.println(phonebook().get("John K. Miller"));
    }

    private static void whoseIsThisNumber() {
        for (Map.Entry<String, String> entry : phonebook().entrySet()) {
            if (entry.getValue().equals("307-687-2982")) {
                System.out.println(entry.getKey());
            }
        }
    }

    private static void findIfNumberExist() {
        if (phonebook().containsKey("Chris E. Myers")) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
//# Telephone book
//
//        We are going to represent our contacts in a map where both the keys and
//        values are strings.
//
//        - Create a map with the following key-value pairs:
//
//        | Name (key)          | Phone number (value) |
//        | :------------------ | :------------------- |
//        | William A. Lathan   | 405-709-1865         |
//        | John K. Miller      | 402-247-8568         |
//        | Hortensia E. Foster | 606-481-6467         |
//        | Amanda D. Newland   | 319-243-5613         |
//        | Brooke P. Askew     | 307-687-2982         |
//
//        - Create an application which prints out the answers to the following
//        questions:
//        - What is John K. Miller's phone number?
//        - Whose phone number is 307-687-2982?
//        - Do we know Chris E. Myers' phone number? (yes/no)
//
//        The full output of your `main` method should be the following:
//
//        ```text
//        402-247-8568
//        Brooke P. Askew
//        no
//        ```
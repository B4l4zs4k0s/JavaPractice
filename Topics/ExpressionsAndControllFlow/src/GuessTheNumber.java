import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        guessTheNumber(returnStoredNumber());
    }

    private static void guessTheNumber(int storedNumber) {
        System.out.println("please provide a number: ");
        Scanner scanner = new Scanner(System.in);
        int guess = scanner.nextInt();
        while (guess != storedNumber) {
            if (guess > storedNumber) {
                System.out.println("your number is bigger than storedNumber");
            } else if (guess < storedNumber) {
                System.out.println("your number is smaller than storedNumber");
            }
            System.out.println("Guess again");
            guess = scanner.nextInt();
        }
        System.out.println("you found the stored number");
    }

    private static int returnStoredNumber() {
        int storedNumber = 8;
        return storedNumber;
    }
}

// Write a program that stores a number and the user has to figure it out.
// The user can input guesses. After each guess the program responds
// with a message indicating whether the stored number is smaller or
// greater than the guess.
// The program ends (exits) when the user finds the stored number
//
// Example:
//
// Please enter your guess: 3
// The stored number is greater than 3
// Please enter your guess: 10
// The stored number is smaller than 10
// Please enter your guess: 8
// You have found the stored number 8
//
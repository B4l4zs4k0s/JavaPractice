import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please write a number");
        int n1 = scanner.nextInt();
        System.out.println("please write another number");
        int n2 = scanner.nextInt();

        if (n2 < n1) {
            System.out.println("The second number should be bigger");
        } else {
            for (int i = n1; i < n2; i++) {
                System.out.println(i);
            }
        }
    }
}
// Create a program that asks for two numbers. If the second number
// is not greater than the first the program should print:
// "The second number should be bigger"
//
// Otherwise it should output all integers between the first and
// the second number (excluding the second number)
//
// Example:
//
// Please enter the first number: 3
// Please enter the second number: 6
// 3
// 4
// 5
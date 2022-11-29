import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {

        divisor();
    }

    private static void divisor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide a divisor");
        int divisor = scanner.nextInt();

        try {
            int result = 12 / divisor;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero!");
        }
    }
}
// Create a function that divides number 10
// by a number that's passed as a paramater and prints the result.
// It should print "fail" if the parameter is 0
import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        System.out.println("How many numbers would you like to enter: ");

        parametricAverage();
    }
    public static void parametricAverage() {
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();
        double sum = 0;

        for (int i = 1; i <= num; i++) {
            System.out.println("Enter number " + i + " of " + num + ": ");
            sum += scanner.nextInt();
        }
        double avr = sum / num;
        System.out.println("Sum =" + (int) sum + ", Average: " + avr);
    }
}

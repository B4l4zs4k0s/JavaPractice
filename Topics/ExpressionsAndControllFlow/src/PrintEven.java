public class PrintEven {
    public static void main(String[] args) {
        printEven500();
    }

    private static void printEven500() {
        for (int i = 0; i <= 500; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
// Create a program that prints all even numbers between 0 and 500
// Each number should be on a new line
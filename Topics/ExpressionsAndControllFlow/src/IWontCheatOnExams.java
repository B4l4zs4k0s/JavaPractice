public class IWontCheatOnExams {
    public static void main(String[] args) {
        printString100Times("I won't cheat on the exam!");
    }

    private static void printString100Times(String string) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i + " " + string);
        }
    }
}
// Create a program that writes this line 100 times:
// "I won't cheat on the exam!"
public class DrawSquare {
    public static void main(String[] args) {
        drawSquare(5);
    }

    public static void drawSquare(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height; j++) {
                if (j == 1 || j == height || i == 1 || i == height) {
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
// Write a program that reads a number from the standard input and
// then draws a square of the specified size
//
// Example:
//
// Please enter the square size: 6
// %%%%%%
// %    %
// %    %
// %    %
// %    %
// %%%%%%
//
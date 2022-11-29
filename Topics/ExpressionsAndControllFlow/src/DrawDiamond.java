public class DrawDiamond {
    public static void main(String[] args) {
        drawDiamond(5);
    }

    public static void drawDiamond(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = height - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j < i * 2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = height - 1; i > 0; i--) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
// Write a program that reads a number from the standard input and
// then draws a diamond of the specified height
//
// Example:
//
// Please enter the diamond height: 4
//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *
//
// Note: the height of the diamond is taken from its base
// (where it is the widest) to the top.
// The total number of lines produced is 2*height-1

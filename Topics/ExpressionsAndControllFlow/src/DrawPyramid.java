public class DrawPyramid {
    public static void main(String[] args) {
        drawPyramid(4);
    }

    public static void drawPyramid(int height) {
        for (int i = 0; i <= height; i++) {
            for (int k = 0; k < height - i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
// Write a program that reads a number from the standard input and
// then draws a pyramid of the specified height
//
// Example:
//
// Please enter the pyramid height: 4
//    *
//   ***
//  *****
// *******
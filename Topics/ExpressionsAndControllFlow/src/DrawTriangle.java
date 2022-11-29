public class DrawTriangle {
    public static void main(String[] args) {
        draw(5);
    }

    public static void draw(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
// Write a program that reads a number from the standard input and
// then draws a triangle of the specified height
//
// Example:
//
// Please enter the triangle height: 4
// *
// **
// ***
// ****
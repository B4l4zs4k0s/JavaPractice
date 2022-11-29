public class DrawDiagonal {
    public static void main(String[] args) {
        draw(6);
    }

    public static void draw(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height; j++) {
                if (j == 1 || j == height || i == 1 || i == height || i == j) {
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
// then draws a square with the main diagonal of the specified size
//
// Example:
//
// Please enter the square size: 6
// %%%%%%
// %%   %
// % %  %
// %  % %
// %   %%
// %%%%%%
//
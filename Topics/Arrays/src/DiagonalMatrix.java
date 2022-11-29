import java.util.Scanner;

public class DiagonalMatrix {
    public static void main(String[] args) {
        System.out.println("Enter size of the matrix");
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();

        int[][] matrix = new int[m][m];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j) {
                    System.out.print(" 1 ");
                } else {
                    System.out.print(" 0 ");
                }
            }
            System.out.println();
        }
    }
}
// Write a program that asks for an integer n,
// then it creates a two-dimensional array (of integers) of the specified
// size (nxn) with the value of 1 on the main diagonal and the value of 0
// everywhere else. Print the 2d array into the output
//
// Example:
//
// Please enter the array (matrix) size: 4
// 1 0 0 0
// 0 1 0 0
// 0 0 1 0
// 0 0 0 1
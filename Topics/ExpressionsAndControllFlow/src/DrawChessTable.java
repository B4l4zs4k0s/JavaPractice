public class DrawChessTable {
    public static void main(String[] args) {
        drawChessTable(8);
    }

    public static void drawChessTable(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    System.out.print("%");
                } else if (i % 2 != 0 && j % 2 != 0) {
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
// then draws a chess table of the specified size
//
// Example:
//
// Please enter the chess table size: 8
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
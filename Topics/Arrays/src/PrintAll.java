public class PrintAll {
    public static void main(String[] args) {
        int[] numbers={4,5,6,7};
        printAllInNewLine(numbers);
    }
    private static void printAllInNewLine(int[] array) {
        for (int element : array) {
            System.out.println(element);
        }
    }
}
// - Create an array variable named `numbers`
//   with the following content: `[4, 5, 6, 7]`
// - Print all the elements of `numbers`
//   one element per line
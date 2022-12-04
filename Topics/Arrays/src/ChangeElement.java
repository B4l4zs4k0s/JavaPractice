public class ChangeElement {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 8, 5, 6};
        changeFourthElementAndPrint(numbers, 3, 4);
    }

    private static void changeFourthElementAndPrint(int[] numbers, int elementIndex, int number) {
        numbers[elementIndex] = number;
        System.out.println(numbers[elementIndex]);
    }
}
// - Create an array variable named `numbers`
//   with the following content: `[1, 2, 3, 8, 5, 6]`
// - Change the value of the fourth element (8) to 4
// - Print the fourth element
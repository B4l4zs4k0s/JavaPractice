public class SumAll {
    public static void main(String[] args) {

        int[] numbers = {3, 4, 5, 6, 7};
        sumArrayAndPrint(numbers);
    }

    private static void sumArrayAndPrint(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }
}
// - Create an array variable named `numbers`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Print the sum of the elements of `numbers`
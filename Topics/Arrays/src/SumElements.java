public class SumElements {
    public static void main(String[] args) {
        int[] numbers = {54, 23, 66, 12};
        addElementsTogetherThenPrint(numbers, 2, 3);
    }

    private static void addElementsTogetherThenPrint(int[] array, int index, int otherIndex) {
        int result = array[index] + array[otherIndex];
        System.out.println(result);
    }
}
//Create a function that adds two value by their index and then print the result on the console
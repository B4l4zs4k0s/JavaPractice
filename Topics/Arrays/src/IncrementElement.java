public class IncrementElement {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        incrementNumberAndPrintIncrementedElement(numbers,2);
    }
    public static void incrementNumberAndPrintIncrementedElement(int[] array, int elementToIncrement){
        array[elementToIncrement]++;
        System.out.println(array[elementToIncrement]);
    }
}
// - Create an array variable named `numbers`
//   with the following content: `[1, 2, 3, 4, 5]`
// - Increment the third element
// - Print the third element
public class SwapElements {
    public static void main(String[] args) {
        String[] orders = {"first", "second", "third"};
       swapOrderByIndexAndPrint(orders,2,0);
    }
    private static void swapOrderByIndexAndPrint(String[] array, int index, int otherIndex){
        String swap = array[index];
        array[index] = array[otherIndex];
        array[otherIndex] = swap;
        for (String s : array) {
            System.out.print(s + " ");
        }
    }
}
// - Create an array variable named `orders`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `orders`
// - Print the 'swapped' array into the console:
//   [third, second, first]
public class SwapElements {
    public static void main(String[] args) {
        String[] orders = {"first", "second", "third"};
        String swap = orders[2];
        orders[2] = orders[0];
        orders[0] = swap;
        for (int i = 0; i < orders.length; i++) {
            System.out.print(orders[i] + " ");
        }
    }
}
// - Create an array variable named `orders`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `orders`
// - Print the 'swapped' array into the console:
//   [third, second, first]
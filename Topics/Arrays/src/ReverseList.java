public class ReverseList {
    public static void main(String[] args) {
        int[] number = {3, 4, 5, 6, 7};
        reverseArrayAndPrint(number);
    }
    private static void reverseArrayAndPrint(int[] array){
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

    private static String buildStringWithComa(int[] array) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int number : array) {
            stringBuilder.append(number).append(", ");
        }
        removeLastComma(stringBuilder);
        return stringBuilder.toString();
    }
    private static void removeLastComma(StringBuilder stringBuilder) {
        stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length() - 1);
    }
}
// - Create an array variable named `numbers`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements of `numbers`
// - Print the elements of the reversed `numbers`
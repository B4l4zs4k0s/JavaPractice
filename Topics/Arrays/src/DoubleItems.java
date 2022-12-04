public class DoubleItems {
    public static void main(String[] args) {
        int[] numbers = {3, 4, 5, 6, 7};
        printArray(numbers);
    }
    private static void printArray(int[] array){
        System.out.println(buildStringWithComa(array));
    }
    private static void doubleArrayItems(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * 2;
        }
    }

    private static String buildStringWithComa(int[] numberArray){
        StringBuilder stringBuilder = new StringBuilder();
        for(int number : numberArray){
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
// - Double all the values in the array and print the modified
//   array to the console as:
//   [6, 8, 10, 12, 14]
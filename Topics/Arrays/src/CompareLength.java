public class CompareLength {
    public static void main(String[] args) {
        int[] firstArrayOfNumbers = {1, 2, 3};
        int[] secondArrayOfNumbers = {4, 5};

        compareLengthOfArraysAndPrint(firstArrayOfNumbers,secondArrayOfNumbers);
    }

    private static void compareLengthOfArraysAndPrint(int[] arrayOne, int[] arrayTwo){
        if (arrayTwo.length > arrayOne.length) {
            System.out.println("secondArrayOfNumbers is longer");
        } else if (arrayOne.length > arrayTwo.length) {
            System.out.println("firstArrayOfNumbers is longer");
        }
    }
}
// - Create an array variable named `firstArrayOfNumbers`
//   with the following content: `[1, 2, 3]`
// - Create an array variable named `secondArrayOfNumbers`
//   with the following content: `[4, 5]`
// - Print "secondArrayOfNumbers is longer" if `secondArrayOfNumbers`
// has more elements than `firstArrayOfNumbers`
// - Otherwise print: "firstArrayOfNumbers is the longer one"
import java.util.Arrays;
import java.util.List;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);
        int sumOfOddNumbers = numbers
                .stream()
                .filter(x -> x % 2 != 0)
                .mapToInt(x -> x)
                .sum();
        System.out.println(sumOfOddNumbers);
    }
}
//Write a method to return the sum of odd numbers in the list of integers below using the Stream API.
//List<Integer> numbers = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);
//int expectedOutput = 61;
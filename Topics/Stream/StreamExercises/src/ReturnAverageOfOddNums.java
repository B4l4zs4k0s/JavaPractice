import java.util.Arrays;
import java.util.List;

public class ReturnAverageOfOddNums {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
        double countAverageOfOdds = numbers
                .stream()
                .filter(x -> x % 2 != 0)
                .mapToDouble(x -> x)
                .average()
                .orElse(0);
        System.out.println(countAverageOfOdds);
        System.out.println((double) 22 / 6);
    }
}
//Write a method to return the average of odd numbers in the list of integers below using the Stream API.
//Implement this without calculating the sum first!
//List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
//double expectedOutput = 22.0/6.0;
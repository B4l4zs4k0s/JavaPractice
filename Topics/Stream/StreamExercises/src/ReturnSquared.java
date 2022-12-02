import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReturnSquared {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

        List<Integer> positiveNumbers = numbers
                .stream()
                .filter(x -> x > 0)
                .map(x -> x * x)
                .collect(Collectors.toList());
        System.out.println(positiveNumbers);
    }
}
//Write a method to return a list of squares of positive numbers from the list of integers below using the Stream API.
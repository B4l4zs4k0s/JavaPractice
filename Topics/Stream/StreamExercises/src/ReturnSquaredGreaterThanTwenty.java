import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReturnSquaredGreaterThanTwenty {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 9, 2, 8, 6, 5);
        List<Integer> greater = numbers
                .stream()
                .filter(x -> x * x > 20)
                .collect(Collectors.toList());
        System.out.println(greater);
    }
}
//Write a method to return a list of numbers whose square is greater than 20
// from the list of integers below using the Stream API. The value 20 should be one of the method's parameters.
// List<Integer> numbers = Arrays.asList(3, 9, 2, 8, 6, 5);
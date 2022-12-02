import java.util.Arrays;
import java.util.List;

public class ReturnEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, -12, 19, 6, 9, 10, 14);

        numbers
                .stream()
                .filter(x -> x % 2 == 0)
                .forEach(System.out::println);
    }
}
//Write a method to return a list of even numbers from the list of integers below using the Stream API.
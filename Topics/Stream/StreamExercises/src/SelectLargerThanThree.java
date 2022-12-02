import java.util.Arrays;
import java.util.List;

public class SelectLargerThanThree {
    public static void main(String[] args) {
        List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        listOfNumbers.stream().filter(x -> x > 3).forEach(System.out::println);
    }
}
//Write a method to return a list of numbers bigger than three using the Stream API.
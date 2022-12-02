import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ReturnStringFromCharacterList {
    public static void main(String[] args) {
        List<Character> characters = Arrays.asList('L', 'o', 'r', 'e', 'm', ' ', 'i', 'p', 's', 'u', 'm');

        String output = characters
                .stream()
                .collect(Collector.of(
                        StringBuilder::new,
                        StringBuilder::append,
                        StringBuilder::append,
                        StringBuilder::toString));
        System.out.println(output);
    }
}
//Write a method to return a string concatenated from a given list of characters using the Stream API.
//
//List<Character> characters = Arrays.asList('L', 'o', 'r', 'e', 'm', ' ', 'i', 'p', 's', 'u', 'm');
//
//String expectedOutput = "Lorem ipsum";
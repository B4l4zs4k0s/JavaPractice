import java.util.List;
import java.util.stream.Collectors;

public class ReturnUppercaseChars {
    public static void main(String[] args) {
        String s = "Lorem Ipsum Dolor Sit Amet, Consectetur Adipiscing Elit. Morbi nec mattis odio.";

        List<Character> expectedOutput = s
                .chars()
                .filter(Character::isUpperCase)
                .mapToObj(Character -> (char) Character)
                .collect(Collectors.toList());
        System.out.println(expectedOutput);
    }
}
//Write a method to return a list of uppercase characters from a given string using the Stream API.
//String s = "Lorem Ipsum Dolor Sit Amet, Consectetur Adipiscing Elit. Morbi nec mattis odio.";
//List<Character> expectedOutput = Arrays.asList('L', 'I', 'D', 'S', 'A', 'C', 'A', 'E', 'M');
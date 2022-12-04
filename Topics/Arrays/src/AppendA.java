import java.util.Arrays;
import java.util.stream.Collectors;

public class AppendA {
    public static void main(String[] args) {
        String[] animals = {"koal", "pand", "zebr", "anacond", "bo", "chinchill", "cobr",
                "gorill", "hyen", "hydr", "iguan", "impal", "pum", "tarantul",
                "piranh"};
        append(animals, "a");
        System.out.println(Arrays.toString(animals));
    }

    private static void append(String[] array, String str) {
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i] + str;
        }
    }
}
// - Create an array variable named `animals`
//   with the following content:
//   `["koal", "pand", "zebr", "anacond", "bo", "chinchill", "cobr",
//     "gorill", "hyen", "hydr", "iguan", "impal", "pum", "tarantul",
//     "piranh"]`
//
// - Add an `"a"` at the end of all elements (use a loop!)
// - Print the 'fixed' array to the console:
//   [koala, panda, zebra, anaconda, boa, ..., puma, tarantula, piranha]
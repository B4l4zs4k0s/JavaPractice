import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListSpecifiedCharacter {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI",
                "AMSTERDAM", "ABU DHABI", "PARIS");

        List<String> returnByFirstCharR = cities
                .stream()
                .filter(city -> city.startsWith("R"))
                .collect(Collectors.toList());
        System.out.println(returnByFirstCharR);

        List<String> returnByFirstCharN = cities
                .stream()
                .filter(city -> city.startsWith("N"))
                .collect(Collectors.toList());
        System.out.println(returnByFirstCharN);
    }
}
//Write a method to return a list of strings which start with the specified character
// (method parameter) using the Stream API.
//List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH",
//"NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");


//List<String> expectedOutput;
//expectedOutput = Arrays.asList("ROME"); // for 'R'
//expectedOutput = Arrays.asList("NAIROBI", "NEW DELHI"); // for 'N'
import java.util.HashMap;
import java.util.stream.IntStream;

public class MapCharacterFrequency {
    public static void main(String[] args) {

        String s = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt.";
        IntStream sStream = s.chars();
        HashMap<Character, Integer> charMap = new HashMap<>();
        sStream
                .forEach(charAt -> charMap
                        .put((char) charAt, charMap
                                .getOrDefault((char) charAt, 0) + 1));
        System.out.println(charMap);
    }
}
//Write a method to return a map specifying the frequency of characters in a given string using the Stream API
//
//String s = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt.";
//{ =12, a=2, c=4, d=7, e=8, g=1, i=10, l=2, ,=2, L=1, m=5, n=4, .=1, o=7, p=3, r=4, s=6, t=7, u=4}
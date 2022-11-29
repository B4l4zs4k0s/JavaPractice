import java.util.Arrays;

public class Anagram {

    public Boolean anagram(String first, String second) {
        String[] splitFirst;
        String[] splitSecond;
        splitFirst = first.split("");
        splitSecond = second.split("");
        String check1 = "";
        String check2 = "";
        Arrays.sort(splitFirst);
        Arrays.sort(splitSecond);

        for (String godLetters : splitFirst) {
            check1 += godLetters;
        }
        for (String dogLetters : splitSecond) {
            check2 += dogLetters;
        }
        System.out.println(check1.equals(check2));
        if (check1.equals(check2)) {
            return true;
        } else {
            return false;
        }
    }
}

public class SubStr {
    public static void main(String[] args) {
        subStr("this is what I'm searching in", "searching");
        subStr("this is what I'm searching in", "not");
    }

    private static int subStr(String input, String sub) {
        for (int i = 0; i < input.length(); i++) {
            System.out.println(input.indexOf(sub));
            return input.indexOf(sub);
        }
        System.out.println("-1");
        return -1;
    }

}   // Create a function that takes two strings as a parameter
// Returns the starting index where
// the second one is starting in the first one
// Returns `-1` if the second string is not in the first one
// Example:
// should print: `17`
// should print: `-1`
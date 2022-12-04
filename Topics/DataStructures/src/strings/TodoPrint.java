package strings;

public class TodoPrint {
    public static void main(String[] args) {
        String todoText = " - Buy milk\n";
        System.out.println(insertStringAtIndex(todoText, 12, " - Download game\n - Diablo"));
    }
    private static String insertStringAtIndex(String source, int index, String stringToInsert) {
        StringBuilder builder = new StringBuilder(source);
        source = String.valueOf(builder.insert(index, stringToInsert
        ));
        return source;
    }
}
// Add "My todo:" to the beginning of the `todoText`
// Add " - Download games" to the end of the `todoText`
// Add " - Diablo" to the end of the `todoText` applying indention

// Expected output:

// My todo:
//  - Buy milk
//  - Download games
//      - Diablo
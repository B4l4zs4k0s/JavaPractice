import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReversedOrder {
    public static void main(String[] args) {
        reverseOrder("reversed-order.txt", "correct-order.txt");
    }

    private static void reverseOrder(String source, String target) {
        Path path = Paths.get(source);
        List<String> content = readFile(path);
        List<String> reverseContent = reverseLines(content);
        Path pathTarget = Paths.get(target);
        writeFile(pathTarget, reverseContent);
    }

    private static List<String> readFile(Path source) {
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(source);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

    private static void writeFile(Path target, List<String> content) {
        try {
            Files.write(target, content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<String> reverseLines(List<String> lines) {
        List<String> reverse = new ArrayList<>();
        String newOrder = "";

        for (int i = lines.size(); i-- > 0; ) {
            newOrder += lines.get(i) + "\r\n";
        }
        reverse.add(newOrder);
        return reverse;
    }
}
// Create a method that decrypts reversed-order.txt
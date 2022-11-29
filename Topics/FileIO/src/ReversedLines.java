import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {
    public static void main(String[] args) {
        decryptReversed("reverse-lines-encrypted.txt", "reverse-lines-decrypted.txt");
    }

    private static void decryptReversed(String source, String target) {
        Path path = Paths.get(source);
        List<String> content = readFile(path);
        List<String> reverse = reverseLines(content);
        Path pathTarget = Paths.get(target);
        writeFile(pathTarget, reverse);
    }

    private static List<String> readFile(Path source) {
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(source);
        } catch (IOException e) {
            System.out.println("Could not read file");
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
        for (String line : lines) {
            char[] lineAsCharArray = line.toCharArray();
            StringBuilder newLine = new StringBuilder();
            for (int i = lineAsCharArray.length - 1; i >= 0; i--) {
                newLine.append(lineAsCharArray[i]);
            }
            reverse.add(newLine.toString());
        }
        return reverse;
    }
}
// Create a method that decrypts reversed-lines.txt
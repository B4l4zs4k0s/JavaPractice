import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PrintEachLine {
    public static void main(String[] args) {
        printPath();
    }

    private static void printPath() {
        Path path = Paths.get("my-file.txt");
        try {
            List<String> content = Files.readAllLines(path);
            for (String line : content) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
// Write a program that opens a file called "my-file.txt" and prints each
// line from the file.
// If the program is unable to read the file (for example the file does not exist),
// it should print the following error message: "Unable to read file: my-file.txt".
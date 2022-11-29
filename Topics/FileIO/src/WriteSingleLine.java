import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLine {
    public static void main(String[] args) {
        writeSingleLintToFile("my-file.txt");
    }

    private static void writeSingleLintToFile(String filename) {
        Path path = Paths.get(filename);
        List<String> content = new ArrayList<>();
        content.add("A new Padawan arises");
        try {
            Files.write(path,content, StandardOpenOption.APPEND);
        } catch (IOException exception) {
            System.out.println("Unable to write file: my-file.txt");
        }
    }
}
// Write a function that is able to manipulate a file
// by writing your name into it as a single line.
// The file should be named "my-file.txt".
// In case the program is unable to write the file,
// it should print the following error message: "Unable to write file: my-file.txt".
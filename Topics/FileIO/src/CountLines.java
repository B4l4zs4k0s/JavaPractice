import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CountLines {
    public static void main(String[] args) {

        System.out.println(countLines("my-file.txt"));
    }

    private static long countLines(String filename) {
        Path path = Paths.get(filename);
        long lines = 0;
        try {
            lines = Files.lines(path).parallel().count();

        } catch (IOException e) {
            return 0;
        }
        return lines;
    }
}
// Write a function called countLines() that takes a filename as string as a parameter
// and returns the number of lines the file contains.
// It should return zero if it can't open the file
// and should not raise any error.
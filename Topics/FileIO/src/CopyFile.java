import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyFile {
    public static void main(String[] args) {
        System.out.println(copyFile("my-file.txt", "copied-text.txt"));
    }

    private static boolean copyFile(String source, String target) {

        Path pathSource = Paths.get(source);
        Path pathTarget = Paths.get(target);
        try {
            Files.copy(pathSource, pathTarget);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
// Write a function that copies the contents of a file into another file
// It should take two filenames (string) as parameters:
//  - path and name of the source file
//  - path and name of the target file
// It should return a boolean that shows if the copy was successful
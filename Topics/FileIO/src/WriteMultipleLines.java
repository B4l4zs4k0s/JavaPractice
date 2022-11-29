import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class WriteMultipleLines {
    public static void main(String[] args) {

        writeMultipleLines("write-lines.txt","Four",4);
    }
    private static void writeMultipleLines(String pathname,String str, int num){
        Path path = Paths.get(pathname);
        List<String> content = new ArrayList<>();
        content.add(str);
        try {
            for (int i = 0; i < num; i++) {
                Files.write(path,content,StandardOpenOption.APPEND);
            }
        } catch (IOException e) {
            System.out.println("Unable to write file: <path>");;
        }
    }
}
// Create a function `writeLines` that takes 3 parameters: a path, a word and a number
// and is able to write into a file.
// - The path parameter should be a string that describes the location (path & name)
//    of the file you wish to modify.
// - The word parameter should also be a string that will be written to the file as individual lines.
// - The number parameter should describe how many lines the file should have.

// If the word is 'apple' and the number is 5, it should write 5 lines
// into the file and each line should read 'apple'.
// The function should not raise any errors and print the "Unable to write file: <path>"
// error mesage
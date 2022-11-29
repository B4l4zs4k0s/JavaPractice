import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {
    public static void main(String[] args) {
        decryptDoubled("encrypted.txt", "decrypted.txt");
    }

    private static void decryptDoubled(String sourceName, String targetName) {
        Path source = Paths.get(sourceName);
        List<String> encryptedLines = readFile(source);
        List<String> decryptedLines = decrypt(encryptedLines);
        Path target = Paths.get(targetName);
        writeFile(target, decryptedLines);
    }

    private static List<String> readFile(Path source) {
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(source);
        } catch (IOException e) {
            System.out.println("File not found");
        }
        return lines;
    }

    private static void writeFile(Path target, List<String> lines) {
        try {
            Files.write(target, lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<String> decrypt(List<String> lines) {
        List<String> newLines = new ArrayList<>();
        for (String line : lines) {
            char[] lineAsCharArray = line.toCharArray();
            String newLine = "";
            for (int i = 0; i < lineAsCharArray.length; i = i + 2) {
                    newLine += lineAsCharArray[i];
                }
                newLines.add(newLine);
            }
            return newLines;
        }
    }

// Create a method called decryptDoubled() that takes a filename string
// as a parameter and decrypts the file's content.
// Decryption is the process reversing an encryption, i.e. the process
// which converts encrypted data into its original form.
// If the file can't be opened it should return this message: File not found
// The (decrypted) result should be saved in the output.txt file
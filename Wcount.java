import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Wcount {
    public static void main(String[] args) {
        String filePath ="D://BDA//inout.txt"; // Path to the input file

        // Call the method to get file statistics
        getFileStatistics(filePath);
    }

    public static void getFileStatistics(String filePath) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            int charCount = 0;
            int wordCount = 0;
            int lineCount = 0;

            String line;
            while ((line = reader.readLine()) != null) {
                // Count characters
                charCount += line.length();
                
                // Count words
                String[] words = line.split("\\s+");
                wordCount += words.length;

                // Count lines
                lineCount++;
            }
            reader.close();

            System.out.println("Number of characters: " + charCount);
            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of lines: " + lineCount);
        } catch (IOException e) {
            System.err.println("Error occurred while reading file: " + e.getMessage());
        }
    }
}

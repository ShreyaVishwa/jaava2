import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ScoreStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the file path
        System.out.print("Enter the file path: ");
        String filePath = scanner.nextLine();

        // Call the method to calculate score statistics
        calculateScoreStatistics(filePath);

        scanner.close();
    }

    public static void calculateScoreStatistics(String filePath) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            int totalScore = 0;
            int count = 0;
            String line;

            while ((line = reader.readLine()) != null) {
                // Split the line by blanks to get individual scores
                String[] scores = line.split("\\s+");
                for (String score : scores) {
                    totalScore += Integer.parseInt(score);
                    count++;
                }
            }
            reader.close();

            if (count == 0) {
                System.out.println("No scores found in the file.");
            } else {
                double averageScore = (double) totalScore / count;
                System.out.println("Total score: " + totalScore);
                System.out.println("Average score: " + averageScore);
            }
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error occurred while reading file or parsing scores: " + e.getMessage());
        }
    }
}

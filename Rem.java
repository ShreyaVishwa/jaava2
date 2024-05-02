import java.io.*;
import java.util.Scanner;

public class Rem {
    public static void main(String[] args) {
        String filePath = "D://BDA//inout.txt";

        // Prompt the user to enter the string to remove
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string to remove from the file: ");
        String stringToRemove = scanner.nextLine();

        // Call the method to remove the string from the file
        removeStringFromFile(filePath, stringToRemove);
        
        scanner.close();
    }

    public static void removeStringFromFile(String filePath, String stringToRemove) {
        try {
            // Read the content of the file
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            StringBuilder stringBuilder = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                // Remove occurrences of the specified string from each line
                line = line.replaceAll(stringToRemove, "");
                stringBuilder.append(line).append("\n");
            }
            reader.close();

            // Write the modified content back to the file
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
            writer.write(stringBuilder.toString());
            writer.close();

            System.out.println("Occurrences of \"" + stringToRemove + "\" have been removed from the file.");
        } catch (IOException e) {
            System.err.println("Error occurred while removing string from file: " + e.getMessage());
        }
    }
}

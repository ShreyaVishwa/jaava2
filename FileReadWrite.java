import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class FileReadWrite {
    public static void main(String[] args) {
        String fileName = "D://BDA//Exercise12_15.txt";
        int numberOfIntegers = 100;

        // Create the file and write 100 random integers to it
        createAndWriteToFile(fileName, numberOfIntegers);

        // Read data from the file and display in increasing order
        displayDataInIncreasingOrder(fileName);
    }

    public static void createAndWriteToFile(String fileName, int numberOfIntegers) {
        try {
            FileWriter fileWriter = new FileWriter(fileName);

            Random random = new Random();
            for (int i = 0; i < numberOfIntegers; i++) {
                int randomNumber = random.nextInt();
                fileWriter.write(randomNumber + " ");
            }

            fileWriter.close();
            System.out.println("Data has been written to the file successfully.");
        } catch (IOException e) {
            System.err.println("Error occurred while writing to file: " + e.getMessage());
        }
    }

    public static void displayDataInIncreasingOrder(String fileName) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            ArrayList<Integer> numbers = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split("\\s+");
                for (String token : tokens) {
                    numbers.add(Integer.parseInt(token));
                }
            }
            reader.close();

            // Sort the numbers in increasing order
            Collections.sort(numbers);

            // Display the sorted numbers
            System.out.println("Data read from the file and displayed in increasing order:");
            for (Integer number : numbers) {
                System.out.print(number + " ");
            }
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error occurred while reading from file or parsing integers: " + e.getMessage());
        }
    }
}

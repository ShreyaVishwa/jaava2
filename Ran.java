import java.util.Random;
import java.util.Scanner;

public class Ran {
    public static void main(String[] args) {
        // Create an array with 100 randomly chosen integers
        int[] array = createRandomArray(100);
        
        // Prompt the user to enter the index of the array
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index of the array (0-99): ");
        int index = scanner.nextInt();
        
        // Check if the index is within bounds and display the corresponding element value
        if (index >= 0 && index < array.length) {
            System.out.println("Element at index " + index + " is: " + array[index]);
        } else {
            System.out.println("Out of Bounds");
        }
        
        scanner.close();
    }
    
    // Method to create an array with random integers
    public static int[] createRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(1000); // Change 1000 to adjust the range of random integers
        }
        return array;
    }
}

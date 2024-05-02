import java.util.Arrays;
public class Lin {
    public static void main(String[] args) {
        // Generate array of 100,000 random integers
        int[] array = generateRandomArray(100000);
        
        // Generate a random key
        int key = (int) (Math.random() * 100000);
        
        // Estimate execution time of linear search
        long startTimeLinear = System.currentTimeMillis();
        linearSearch(array, key);
        long endTimeLinear = System.currentTimeMillis();
        long executionTimeLinear = endTimeLinear - startTimeLinear;
        System.out.println("Linear Search Execution Time: " + executionTimeLinear + " milliseconds");
        
        // Sort the array for binary search
        Arrays.sort(array);
        
        // Estimate execution time of binary search
        long startTimeBinary = System.currentTimeMillis();
        binarySearch(array, key);
        long endTimeBinary = System.currentTimeMillis();
        long executionTimeBinary = endTimeBinary - startTimeBinary;
        System.out.println("Binary Search Execution Time: " + executionTimeBinary + " milliseconds");
    }
    
    // Method to generate a random array of given length
    public static int[] generateRandomArray(int length) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = (int) (Math.random() * 100000);
        }
        return array;
    }
    
    // Linear search method
    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i; // Key found, return index
            }
        }
        return -1; // Key not found
    }
    
    // Binary search method
    public static int binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (array[mid] == key) {
                return mid; // Key found, return index
            } else if (array[mid] < key) {
                low = mid + 1; // Search the right half
            } else {
                high = mid - 1; // Search the left half
            }
        }
        return -1; // Key not found
    }
}

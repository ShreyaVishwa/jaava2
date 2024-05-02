import java.util.Scanner;

public class Allsame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the square matrix: ");
        int length = scanner.nextInt();

        // Create the matrix
        int[][] matrix = new int[length][length];

        // Prompt the user to enter each element of the matrix
        System.out.println("Enter the elements of the matrix (0 or 1):");
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Print the matrix
        System.out.println("Entered Matrix:");
        printMatrix(matrix);

        // Find rows, columns, and diagonals with all 0s or 1s
        findPatterns(matrix);

        scanner.close();
    }

    // Method to print the matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to find rows, columns, and diagonals with all 0s or 1s
    public static void findPatterns(int[][] matrix) {
        int length = matrix.length;

        // Check rows and columns
        for (int i = 0; i < length; i++) {
            boolean allZeroRow = true;
            boolean allOneRow = true;
            boolean allZeroColumn = true;
            boolean allOneColumn = true;

            for (int j = 0; j < length; j++) {
                if (matrix[i][j] != 0) allZeroRow = false;
                if (matrix[i][j] != 1) allOneRow = false;
                if (matrix[j][i] != 0) allZeroColumn = false;
                if (matrix[j][i] != 1) allOneColumn = false;
            }

            if (allZeroRow) System.out.println("Row " + (i + 1) + " consists of all 0s.");
            if (allOneRow) System.out.println("Row " + (i + 1) + " consists of all 1s.");
            if (allZeroColumn) System.out.println("Column " + (i + 1) + " consists of all 0s.");
            if (allOneColumn) System.out.println("Column " + (i + 1) + " consists of all 1s.");
        }

        // Check diagonals
        boolean allZeroDiagonal1 = true;
        boolean allOneDiagonal1 = true;
        boolean allZeroDiagonal2 = true;
        boolean allOneDiagonal2 = true;

        for (int i = 0; i < length; i++) {
            if (matrix[i][i] != 0) allZeroDiagonal1 = false;
            if (matrix[i][i] != 1) allOneDiagonal1 = false;
            if (matrix[i][length - i - 1] != 0) allZeroDiagonal2 = false;
            if (matrix[i][length - i - 1] != 1) allOneDiagonal2 = false;
        }

        if (allZeroDiagonal1) System.out.println("Diagonal 1 consists of all 0s.");
        if (allOneDiagonal1) System.out.println("Diagonal 1 consists of all 1s.");
        if (allZeroDiagonal2) System.out.println("Diagonal 2 consists of all 0s.");
        if (allOneDiagonal2) System.out.println("Diagonal 2 consists of all 1s.");
    }
}

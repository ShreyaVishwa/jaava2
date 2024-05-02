import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab5rev2 {
    public static void main(String[] args) {
        String[] m = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        int [] d = {31,28,31,30,31,30,31,31,30,31,30,31};
        Scanner s = new Scanner(System.in);
        try {
            System.out.println("Enter the month number (1-12): ");
            int n = s.nextInt();
            try {
                String mon = m[n-1]; // Adjust index by 1 since arrays are 0-indexed
                int days = d[n-1];   // Adjust index by 1 since arrays are 0-indexed
                System.out.println("The " + n + "th month is " + mon + " and it contains " + days + " no of days");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid month number. Please enter a number between 1 and 12.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }
    }
}

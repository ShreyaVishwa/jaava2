import java.util.Scanner;

public class lab1rev4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the marks scored!");
        int marks = scanner.nextInt();
        char g = (marks >= 90) ? 'A' : (marks >= 80) ? 'B' : (marks >= 70) ? 'C' : (marks >= 60) ? 'D' : 'F';
        System.out.println("Grade: " + g);

        System.out.println("enter an number:");
        int num = scanner.nextInt();
        boolean divBy2 = num % 2 == 0;
        boolean divBy3 = num % 3 == 0;
        boolean divBy2Or3 = divBy2 || divBy3;
        boolean divBy2And3 = divBy2 && divBy3;
        boolean divBy2Xor3 = divBy2 ^ divBy3;
        System.out.println("Divisible by 2 and 3: " + divBy2And3);
        System.out.println("Divisible by 2 or 3: " + divBy2Or3);
        System.out.println("Divisible by 2 or 3 but not both: " + divBy2Xor3);

        System.out.println("enter a year! ");
        int year = scanner.nextInt();
        boolean leap = (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
        System.out.println("Leap year? " + leap);

        scanner.close();
    }
}

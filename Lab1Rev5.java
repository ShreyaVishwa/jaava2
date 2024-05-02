import java.util.Scanner;

public class Lab1Rev5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a character: ");
        char c = scanner.next().charAt(0);
        boolean vowel = "aeiouAEIOU".indexOf(c) != -1;
        System.out.println((vowel) ? "Vowel" : "Consonant");

        System.out.println("enter no of layers :");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("enter a limit : ");
        int N = scanner.nextInt();
        int a = 0, b = 1, sum = 0, count = 0;
        while (count < N) {
            if (b % 2 == 0) {
                sum += b;
                count++;
            }
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println("Sum of first " + N + " even Fibonacci numbers: " + sum);

        scanner.close();
    }
}

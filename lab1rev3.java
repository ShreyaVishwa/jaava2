import java.util.Scanner;
public class lab1rev3 {
    public static void main(String[] args) {
        int n = 1, temp, digit, result = 0;
        Scanner s = new Scanner(System.in);
        int l = s.nextInt();
        for (int i = 1; i <= l; i++) {
            temp = i;
            while (temp != 0) {
                digit = temp % 10;
                result += digit * digit * digit;
                temp /= 10;
            }
            if (result == i) {
                System.out.print(i + " ");
            }
            result = 0;
        }
        System.out.println("enter an integer");
        int f = s.nextInt();
        for(int j=1;j<=f;j++){
            n=n*j;
        }
        System.out.println("the factorial is : "+n);

        System.out.println("enter principa , rate of interest and no of years:");
        double p = s.nextDouble();
        double r = s.nextDouble();
        double n1 = s.nextDouble();
        double si=p*n1*(r/100);
        System.out.println("the simple interest is "+si);
        double ci=p * Math.pow((1 + (r/100)), n1) - p;
        System.out.println("the compound interest is "+ci);
    }
}

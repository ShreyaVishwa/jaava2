import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab5rev {
    public static void main(String[] args) {
        String[] m = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        int [] d = {31,28,31,30,31,30,31,31,30,31,30,31};
        Scanner s = new Scanner(System.in);
        System.out.println("enter the month name: ");
        int n = s.nextInt();
        try{
            String mon = m[n];
            int days = d[n];
            System.out.println("the "+n+"th month is "+mon+" and it contains "+days+"no of days");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index out of Bound!");
        }
        
    }
}

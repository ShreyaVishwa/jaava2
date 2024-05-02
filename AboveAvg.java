import java.util.*;
import java.util.Scanner;
public class AboveAvg {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double sum = 0;
        System.out.println("enter the size of an array");
        int n = s.nextInt();
        ArrayList<Double> l = new ArrayList<Double>();
        ArrayList<Double> l1 = new ArrayList<Double>();
        for(int i=0;i<n;i++){
            System.out.println("enter the element"+(i+1));
            Double s1 = s.nextDouble();
            l.add(s1);
            sum+=s1;

        }
        double avg = sum/n;
        for(int i=0;i<n;i++){
            double x = l.get(i);
            if(x>=avg){
                l1.add(x);
            }

        }
        System.out.println("the list of elements above average is "+ l1);
        s.close();
    }
     

}
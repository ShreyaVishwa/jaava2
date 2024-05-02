import java.util.*;
public class Count {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n = s.nextInt();
        ArrayList<String> l = new ArrayList<String>();
        for(int i=0;i<n;i++){
            System.out.println("enter the character:");
            String s1 = s.next();
            l.add(s1);
        }
        for(int i=0;i<n;i++){
            String x = l.get(i);
            int n1=Collections.frequency(l, x);
            System.out.println("the frequency of object "+x+" is "+n1 );
        }
        s.close();
    }


}
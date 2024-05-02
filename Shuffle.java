import java.util.*;
import java.util.Scanner;
public class Shuffle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n = s.nextInt();
        ArrayList<String> l = new ArrayList<String>();
        for(int i=0;i<n;i++){
            System.out.println("enter the element"+(i+1));
            String s1 = s.next();
            l.add(s1);

        }
        System.out.println("the original List "+l);
        Collections.shuffle(l);
        System.out.println("the shuffled list is "+l);
        s.close();
    }


}

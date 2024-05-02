import java.util.*;
public class Alist {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("prepare to enter 5 elements:");
        List<Integer> al = new ArrayList<>();
        for(int i=0;i<5;i++){
            System.out.println("enter a no:");
            int a = s.nextInt();
            al.add(a);
        }
        Collections.sort(al);
        System.out.println(al);
    }

}

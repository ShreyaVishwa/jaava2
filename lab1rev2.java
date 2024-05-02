//odd or eve , largest 3 , prime from 1 to n

import java.util.*;

public class lab1rev2 {
    static boolean isPrime(int n){
        if(n==1||n==0)return false;
        for(int i=2; i<n; i++){
              if(n%i==0)return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a nos");
        int a = s.nextInt();
        if(a%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd!");
        }
        System.out.println("enter 3 nos: ");
        int b = s.nextInt();
        int c = s.nextInt();
        int d = s.nextInt();
        List<Integer> al = new ArrayList<Integer>();
        al.add(b);
        al.add(c);
        al.add(d);
        Collections.sort(al);
        int greatest = al.get(2);
        System.out.println("the maximum of 3 nos is "+ greatest);
        System.out.println("enter prime no limit:");
        int N = s.nextInt(); 
        for(int i=1; i<=N; i++){
            if(isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        

    }
    
}



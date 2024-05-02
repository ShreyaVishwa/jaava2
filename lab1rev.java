//Read and print , multiply 2 float , swap 2 nos:

import java.util.*;

public class lab1rev {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter an integer:");
        int a = s.nextInt();
        System.out.println("entered integer is "+a);
        System.out.println("enter 2 float nos:");
        float a1 = s.nextFloat();
        float b1 = s.nextFloat();
        float res = a1*b1;
        System.out.println("the result of multiplication "+res);
        System.out.println("enter 2 nos:");
        int b = s.nextInt();
        int c = s.nextInt();
        System.out.println("before swap b = "+b+" and  c = "+c);
        int temp = b;
        b=c;
        c=temp;
        System.out.println("after swap b = "+b+" and c = "+c);
    
    }


}

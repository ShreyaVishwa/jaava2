import java.util.Scanner;
public class Identical {
    public static boolean equals(int[] list1, int[] list2) {
        int a=list1.length;
        int b = list2.length;
        int c = 0;
        char x ='t';
        if(a==b){
            for(int i=0; i<a;i++){
                if(list1[i]==list2[i]){
                    c+=1;
                }
                else{
                    x ='f';
                }
            }

        } 
        else{
            x='f';
        }
        
        if(c==a){
            x='t';
        }
        if(x=='t'){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the array size of array 1");
        int l1=s.nextInt();
        int[] li1 = new int[l1];
        System.out.println("enter the array size of array 2");
        int l2=s.nextInt();
        int[] li2 = new int[l2];
        for(int j=0;j<l1;j++){
            System.out.println("the element "+(j+1));
            li1[j]=s.nextInt();
        }
        for(int j=0;j<l2;j++){
            System.out.println("the element "+(j+1));
            li2[j]=s.nextInt();
        }
        s.close();
        boolean res=equals(li1,li2);
        if(res == true){
            System.out.println("the lists are idendical strictly");
        }
        if(res == false){
            System.out.println("the lists are not idendical strictly");
        }
    }

}

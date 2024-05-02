import java.util.Scanner;
public class mini {
    public static double min(double[] array){
        double min=array[0] ;
        int y=array.length;
        for(int i=0;i<y;i++){
            if (min > array[i]){
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter the no of elements in array");
        int n = s.nextInt();
        double[] list = new double[n];  
        for(int i=0;i<n;i++){
            System.out.println("enter element "+(i+1));
            list[i]=s.nextDouble();
        }  
        double res=min(list);
        System.out.println("the minimum element in the list is  "+res);
        s.close();

    }
}

import java.util.Scanner;
public class Avgovl {
    public static int average(int[] array){
        int y = array.length;
        int sum=0;
        for(int i=0;i<y;i++){
            sum+=array[i];
        }
        int avg = sum/y;
        return avg;
    }
    public static double average(Double[] array){
        int y = array.length;
        Double sum=0.0;
        for(int i=0;i<y;i++){
            sum+=array[i];
        }
        Double avg = sum/y;
        return avg;

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [] a = new int[10];
        Double [] ad = new Double[10];

        for(int i=0;i<10;i++){
            System.out.println("enter the element "+(i+1));
            a[i]=s.nextInt();
        }
        for(int i=0;i<10;i++){
            System.out.println("enter the element "+(i+1));
            ad[i]=s.nextDouble();
        }
        Double res = average(ad);
        System.out.println(res);
        int r =average(a);
        System.out.println(r);
        s.close();
    }
    

}

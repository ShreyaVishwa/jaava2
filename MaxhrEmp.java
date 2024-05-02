import java.util.*;
import java.util.Map.Entry;
public class MaxhrEmp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the no of employees");
        int r = s.nextInt();
        int sum=0;
        Map<Integer,Integer> hrsum = new HashMap<>();
        int[][] emp = new int[r][7];
        for(int i=0;i<emp.length;i++){
            for(int j=0;j<emp[i].length;j++){
                System.out.println("enter the hrs of employee "+(i+1)+"on day "+(j+1));
                emp[i][j]=s.nextInt();
                
            }
        }
        for(int i=0;i<emp.length;i++){
            for(int j=0;j<emp[i].length;j++){
                sum+=emp[i][j];
            }
            hrsum.put(i,sum);
            sum=0;
        }
        System.out.println(hrsum);
        List<Map.Entry<Integer, Integer>> sorted = new ArrayList<>(hrsum.entrySet());
        Collections.sort(sorted, (a, b) -> b.getValue().compareTo(a.getValue()));
        System.out.println("\nemployees sorted by max worked hrs (decreasing order):");
        for (Entry<Integer, Integer> entry : sorted) {
            System.out.println((entry.getKey()+1) + "has worked " + entry.getValue());
        }
        s.close();

    }
}

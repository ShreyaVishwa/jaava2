import java.util.*;

public class Dupl {
    public static void main(String[] args) {
        System.out.println("Enter array size:");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element " + (i + 1) + ":");
            arr[i] = s.nextInt();
        }

        int[] result = eliminateDuplicates(arr);

        System.out.println("Array after eliminating duplicates: " + Arrays.toString(result));
        s.close();
    }

    public static int[] eliminateDuplicates(int[] list) {
        List<Integer> al = new ArrayList<>();

        for (int i = 0; i < list.length; i++) {
            if (!al.contains(list[i])) {
                al.add(list[i]);
            }
        }

        // Convert ArrayList back to array
        int[] result = new int[al.size()];
        for (int i = 0; i < al.size(); i++) {
            result[i] = al.get(i);
        }

        return result;
        
    }
}

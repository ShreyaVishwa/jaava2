import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Decrsc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        Map<String, Integer> studentScores = new HashMap<>();
        
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            
            System.out.print("Enter student score: ");
            int score = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            studentScores.put(name, score);
        }
        
        List<Map.Entry<String, Integer>> sortedStudents = new ArrayList<>(studentScores.entrySet());
        
        // Sort the list of students based on their scores in decreasing order
        Collections.sort(sortedStudents, (a, b) -> b.getValue().compareTo(a.getValue()));
        
        System.out.println("\nStudents sorted by score (decreasing order):");
        for (Map.Entry<String, Integer> entry : sortedStudents) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        scanner.close();
    }
}

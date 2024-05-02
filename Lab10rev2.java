import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Lab10rev2 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        FileWriter fw = new FileWriter("D://CS6308//telephone.txt");
        System.out.println("Enter the number of people in input:");
        int n = s.nextInt();
        s.nextLine(); // Consume newline left-over

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the name and phoneno separated by a space:");
            String str = s.nextLine();
            fw.write(str); // Write the entire line

            // Add line break after each name and marks pair
            fw.write("\n");
        }

        System.out.println("Writing successful");
        // Close the file
        fw.close();
        System.out.println("enter phno to be searched:");
        String phno = s.nextLine();
        s.close();
        try (Scanner fr = new Scanner(new File("D://CS6308//telephone.txt"))){
            while(fr.hasNextLine()){
                String l = fr.nextLine();
                String[] p = l.split(" ");
                int i=0;
                if(p.length==2 && p[1].equals(phno)){
                    System.out.println(p[0]);

                }

            }
        }
        catch(FileNotFoundException e){
            System.out.println("file not found!");
        }
    }
}
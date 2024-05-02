import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Lab10rev {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        FileWriter fw = new FileWriter("D://CS6308//output.txt");
        System.out.println("Enter the number of people in input:");
        int n = s.nextInt();
        s.nextLine(); // Consume newline left-over

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the name and marks separated by a space:");
            String str = s.nextLine();
            fw.write(str); // Write the entire line

            // Add line break after each name and marks pair
            fw.write("\n");
        }

        System.out.println("Writing successful");
        // Close the file
        fw.close();
        s.close();
        int ch; 
  
        // check if File exists or not 
        FileReader fr=null; 
        try
        { 
            fr = new FileReader("D:\\CS6308\\output.txt"); 
        } 
        catch (FileNotFoundException fe) 
        { 
            System.out.println("File not found"); 
        } 
  
        // read from FileReader till the end of file 
        while ((ch=fr.read())!=-1) 
            System.out.print((char)ch); 
    }
}

import java.util.ArrayList;
import java.util.*;

public class lab3rev2 {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        List<Character> al = new ArrayList<Character>();
        List<Character> al1 = new ArrayList<Character>();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (!Character.isDigit(currentChar) && !Character.isLetter(currentChar) && !Character.isWhitespace(currentChar)) {
                continue;
            }
            else{
                 al.add(currentChar);
                 al1.add(currentChar);
            }
        }
        Collections.reverse(al1);
        boolean res = al.equals(al1);
        if(res==true){
            System.out.println("palindrome!");
        }
        else{
            System.out.println("not a palindrome!");
        }
        
    }
}

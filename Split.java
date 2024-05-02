import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;

public class Split {

    public static String[] split(String s, String regex) {
        // Escape special characters in regex
        String escapedRegex = regex.replaceAll("[\\[\\](){}+*?|.^$\\\\]", "\\\\$0");
        // Construct the pattern to match the delimiters
        Pattern pattern = Pattern.compile("(" + escapedRegex + ")");
        Matcher matcher = pattern.matcher(s);

        ArrayList<String> parts = new ArrayList<>();
        int lastMatchEnd = 0;

        while (matcher.find()) {
            // Add the substring before the match
            if (matcher.start() > lastMatchEnd) {
                parts.add(s.substring(lastMatchEnd, matcher.start()));
            }
            // Add the delimiter itself
            parts.add(matcher.group());
            // Update the last match end index
            lastMatchEnd = matcher.end();
        }

        // Add the remaining substring after the last match
        if (lastMatchEnd < s.length()) {
            parts.add(s.substring(lastMatchEnd));
        }

        // Convert ArrayList to String array
        String[] result = new String[parts.size()];
        result = parts.toArray(result);
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String inputString = scanner.nextLine();
        System.out.print("Enter the delimiter regex pattern: ");
        String delimiterPattern = scanner.nextLine();

        String[] result = split(inputString, delimiterPattern);
        System.out.println("\nResult:");
        for (String str : result) {
            System.out.println(str);
        }
        scanner.close();
    }
}

package level1BeginnerLevel;
import java.util.Scanner;

public class RemoveEveryOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string: ");
        String s1 = sc.nextLine();

        System.out.println("Enter character which you want to remove from this string: ");
        char removeOcc = sc.next().charAt(0);

        // We'll build a new string without the unwanted character
        String newString = "";

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != removeOcc) {
                newString += s1.charAt(i); // append only if it's not the character to remove
            }
        }

        System.out.println("String after removing '" + removeOcc + "': " + newString);

        sc.close();
    }
}

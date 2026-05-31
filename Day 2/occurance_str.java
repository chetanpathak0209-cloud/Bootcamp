import java.util.*;

public class occurance_str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String str = sc.nextLine();

        System.out.print("Enter the substring to replace: ");
        String oldStr = sc.nextLine();

        System.out.print("Enter the new substring: ");
        String newStr = sc.nextLine();

        if (oldStr.isEmpty()) {
            System.out.println("\nError: The substring to replace cannot be empty.");
        } else {
            String result = str.replace(oldStr, newStr);
            System.out.println("\nModified String: " + result);
        }

        sc.close();
    }
}
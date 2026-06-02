
import java.util.*;

public class rotate_the_str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int n = sc.nextInt();
        char dir = sc.next().charAt(0);

        int len = s.length();
        n %= len;

        String rotated;

        if (dir == 'L') {
            rotated = s.substring(n) + s.substring(0, n);
        } else {
            rotated = s.substring(len - n) + s.substring(0, len - n);
        }

        StringBuilder ans = new StringBuilder(rotated);

        for (int i = 0; i < n && i < ans.length(); i++) {
            char ch = ans.charAt(i);

            if (Character.isUpperCase(ch))
                ans.setCharAt(i, Character.toLowerCase(ch));
            else if (Character.isLowerCase(ch))
                ans.setCharAt(i, Character.toUpperCase(ch));
        }

        System.out.print(ans);
    }
}

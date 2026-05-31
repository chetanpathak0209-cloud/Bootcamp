import java.util.*;

public class first_non_repeating_ch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                System.out.println(ch);
                return;
            }
        }

        System.out.println("No non-repeating character");
    }
}

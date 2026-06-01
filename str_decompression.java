
import java.util.*;

public class str_decompression {
    static int i = 0;

    static String decode(String s) {
        StringBuilder res = new StringBuilder();

        while (i < s.length() && s.charAt(i) != ']') {
            if (Character.isDigit(s.charAt(i))) {
                int n = 0;
                while (Character.isDigit(s.charAt(i)))
                    n = n * 10 + (s.charAt(i++) - '0');

                i++;
                String t = decode(s);
                i++; 

                while (n-- > 0) res.append(t);
            } else {
                res.append(s.charAt(i++));
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(decode(sc.nextLine()));
    }
}


import java.util.*;

public class non_repeating {
    public static void main(String[] args) {
        String s = "programming";
        
        for (char c : s.toCharArray()) {
            if (s.indexOf(c) == s.lastIndexOf(c)) {
                System.out.println(c);
                break;
            }
        }
    }
}

import java.util.*;

public class valid_paren {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Stack<Character> st = new Stack<>();

        for(char ch : s.toCharArray()) {
            if(ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if(st.isEmpty()) {
                    System.out.println("Invalid");
                    return;
                }

                char top = st.pop();

                if((ch == ')' && top != '(') ||
                   (ch == '}' && top != '{') ||
                   (ch == ']' && top != '[')) {
                    System.out.println("Invalid");
                    return;
                }
            }
        }

        System.out.println(st.isEmpty() ? "Valid" : "Invalid");
    }
}

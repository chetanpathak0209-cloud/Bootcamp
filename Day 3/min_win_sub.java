
import java.util.*;

public class min_win_sub{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String t = sc.nextLine();

        int[] need = new int[128];

        for(char c : t.toCharArray())
            need[c]++;

        int left = 0, count = t.length();
        int minLen = Integer.MAX_VALUE, start = 0;

        for(int right = 0; right < s.length(); right++) {

            if(need[s.charAt(right)]-- > 0)
                count--;

            while(count == 0) {

                if(right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                if(++need[s.charAt(left)] > 0)
                    count++;

                left++;
            }
        }

        if(minLen == Integer.MAX_VALUE)
            System.out.println("");
        else
            System.out.println(s.substring(start, start + minLen));
    }
}

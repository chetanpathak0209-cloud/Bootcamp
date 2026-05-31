
import java.util.*;

public class group_anagram {
    public static void main(String[] args) {
        String[] arr = {"cat","tac","act","dog","god"};

        HashMap<String, List<String>> map = new HashMap<>();

        for(String s : arr){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String key = new String(c);

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        System.out.println(map.values());
    }
}
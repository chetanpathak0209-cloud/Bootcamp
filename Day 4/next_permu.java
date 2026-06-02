import java.util.*;
public class next_permu {

    static String nextPermutation(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;

        int i = n - 2;
        while (i >= 0 && arr[i] >= arr[i + 1])
            i--;

        if (i < 0)
            return "No Next Permutation";

        int j = n - 1;
        while (arr[j] <= arr[i])
            j--;

        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        int l = i + 1, r = n - 1;
        while (l < r) {
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }

        return new String(arr);
    }

    public static void main(String[] args) {
        String s = "abcd";
        System.out.println(nextPermutation(s));
    }
}

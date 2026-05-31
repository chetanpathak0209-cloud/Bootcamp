import java.util.*;
public class prefix_sum
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Build Prefix Sum Array
        int prefix[] = new int[n];
        prefix[0] = arr[0];

        for(int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        // Range Query
        int l = sc.nextInt();
        int r = sc.nextInt();

        int sum;
        if(l == 0)
            sum = prefix[r];
        else
            sum = prefix[r] - prefix[l - 1];

        System.out.println(sum);
    }
}

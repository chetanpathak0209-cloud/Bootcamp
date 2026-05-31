import java.util.*;

public class username {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        String id = sc.nextLine();

        System.out.println(name.replace(" ", "_") + id);
    }
}
    


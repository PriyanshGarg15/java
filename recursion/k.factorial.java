package recursion;
import java.util.*;

public class factorial {
    public static int dec(int n) {
        if (n == 0) {
            return 1;
        }
        return n * dec(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(dec(n));
    }
}

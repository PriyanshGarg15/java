package recursion;
import java.util.*;

public class print_increasing_decreasing {
    public static int dec(int n) {
        if (n == 0) {
            return 1;
        }
        int d = n * dec(n - 1);
        return d;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(dec(n));
    }
}

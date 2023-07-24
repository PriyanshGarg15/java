package recursion;
import java.util.*;

public class factorial {
    public static int fac(int n) {
        if (n == 1) {
            return 1;
        }
        int fn1=fac(n-1);
        int fn=n*fn1;
        return fn;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fac(n));
    }
}

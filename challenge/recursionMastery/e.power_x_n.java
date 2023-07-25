package recursion;
import java.util.*;

public class power_x_n {
    public static int fac(int x,int n) {
        if (n == 0) {
            return 1;
        }
        return x*fac(x,n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(fac(x,n));
    }
}

//this is the called the factorial way of solvinf recursion problems9where we directly return the answer from function)
package recursion.basic_problems;
import java.util.Scanner;
public class print_sum_of_first_n_function_return_sum {

    public static int Priyansh(int n) {
        if (n ==0) {
            return 0 ;
        }
        return n+Priyansh(n-1);
    }

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int x=Priyansh(n);
        System.out.println(x);
    }
}

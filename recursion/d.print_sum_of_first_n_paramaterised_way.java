package recursion.basic_problems;
import java.util.Scanner;
public class print_sum_of_first_n {

    public static void Priyansh(int n,int s) {
        if (n <0) {
            System.out.println(s);
            return ;
        }
        s=s+n;
        Priyansh(n-1, s);
    }

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        Priyansh(n,0);
    }
}

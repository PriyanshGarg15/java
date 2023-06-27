package recursion;
import java.util.*;
public class print_decreasing 
{
    public static void dec(int n)
    {
        if(n==1)
        {
            System.out.println(n);
            return ;
        }
        dec(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        dec(n);
    }
}

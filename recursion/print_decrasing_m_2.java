package recursion;
import java.util.*;
public class print_decreasing 
{
    public static void dec(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        dec(n-1);
     
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        dec(n);
    }
}

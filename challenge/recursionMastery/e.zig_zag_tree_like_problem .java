package recursion;
import java.util.*;

public class zig_zag_tree_like_problem 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        puzz(n);
    }
    public static void puzz(int n) 
    {
        if(n==0)
        {
            return;
        }
        System.out.println("Pre"+n);
        puzz(n-1);
        System.out.println("In"+n);
        puzz(n-1);
        System.out.println("Post"+n);

    }
}

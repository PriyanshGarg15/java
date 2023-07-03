package recursion;
import java.util.*;

public class tower_of_hanoi 
{
    public static void han(int n,char src,char des,char aux) 
    {
        if(n==0)
        {
            return;
        }
        han(n-1,src,aux,des);
        System.out.println(n+"["+src+"->"+des+"]");
        han(n-1,aux,des,src);


    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        han(n,'A','B','C');
    }
}

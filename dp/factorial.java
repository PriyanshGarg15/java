package DP;
import java.util.*;
public class fibonacci 
{
    
    public static int fib(int n,int qb[])
    {
        if(n<=1)
        {
            return n;
        }
        if(qb[n]!=0)
        {
            return qb[n];
        }
        int fi=fib(n-1,qb)+fib(n-2,qb);
        qb[n]=fi;
        return fi;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=fib(n,new int[n+1]);
        System.out.println(x);
    }
}

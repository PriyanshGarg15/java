package recursion;

import java.util.Scanner;

public class print_array_reverse 
{
     public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int k=sc.nextInt();
            arr[i]=k;
        }
        rec(arr,0);
    }
    public static void rec(int arr[],int n) 
    {
        if(n==arr.length)
        {
            return;
        }
        rec(arr,n+1);
        System.out.println(arr[n]);
        
    }
}

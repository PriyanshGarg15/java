package recursion;

import java.util.Scanner;

public class print_max_in_array 
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
        int k=max(arr,0);
        System.out.println(k);
    }
    public static int max(int arr[],int n) 
    {
        if(n==arr.length-1)
        {
            return arr[n];
        }
        int k=max(arr,n+1);
        if(k>arr[n])
        {
            return k;
        }
        else
        {
            return arr[n];
        }

        
    }
}

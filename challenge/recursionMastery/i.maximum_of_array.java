package recursion;

import java.util.Scanner;

public class maximum_of_array 
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
        int p=rec(arr,0);
        System.out.println(p);
    }
    public static int rec(int arr[],int n) 
    {
        if(n==arr.length-1)
        {
            return arr[n];
        }
       int frarr= rec(arr,n+1);
       if(arr[n]>frarr)
       {
        return arr[n];
       }
       else{
        return frarr;
       }
        
    }
}

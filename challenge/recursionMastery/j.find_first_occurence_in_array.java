package recursion;

import java.util.Scanner;

public class find_first_occurence_in_array {
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
        int d=sc.nextInt();
        int k=rec(arr,0,d);
        System.out.println(k);
    }
    public static int rec(int arr[],int n,int d) 
    {
        if(n==arr.length)
        {
            return -1;
        }
        if(arr[n]==d)
        {
            return n;
        }
        else
        {
            int fis=rec(arr,n+1,d);
            return fis;
        }
        
    }
    
}

// ------------------------------
// method-2(more time taking)
//     public static int rec(int arr[],int n,int d) 
//     {
//         if(n==arr.length)
//         {
//             return -1;
//         }
//         int fis=rec(arr,n+1,d);
//         if(arr[n]==d)
//         {
//             return n;
//         }
//         else
//         {
//             return fis;
//         }
//     }

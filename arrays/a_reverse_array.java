package a_my_codes.a_arrays;

import java.util.Scanner;

public class reverse_array 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int i1=0;
        int i2=n-1;
        for(int i=0;i<n/2;i++)
        {
            int temp=arr[i1];
            arr[i1]=arr[i2];
            arr[i2]=temp;
            i1++;
            i2--;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

package recursion;
import java.util.ArrayList;
import java.util.Scanner;
public class subset_having_sum_k_count_total 
{
   public static int subset(int[] arr, int s)
   {
      ArrayList<Integer> curr = new ArrayList<Integer>();
      int x=subsets(arr, 0, curr, s);
      return x;
   }
   
   public static int subsets(int[] arr, int i, ArrayList<Integer> curr, int s)
   {
      if(i == arr.length)
      {
         int sum = 0;
         for(int j=0;j<curr.size();j++)
         {
            sum += curr.get(j);
         }
         if(sum == s)
         {
            return 1;
         }
         return 0;
      }
      curr.add(arr[i]);
      int l=subsets(arr, i+1, curr,s);
      curr.remove(curr.size() - 1);
      int r=subsets(arr, i+1, curr, s);
      return l+r;
   }
   
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      for(int i = 0; i < n; i++)
      {
         int k = sc.nextInt();
         arr[i] = k;
      }
      int s = sc.nextInt();
      int subsets = subset(arr, s);
      System.out.println("Subsets with sum " + s + ":");
      System.out.println(subsets);
      
   }
}

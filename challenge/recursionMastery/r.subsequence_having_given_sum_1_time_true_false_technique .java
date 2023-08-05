package recursion;
import java.util.ArrayList;
import java.util.Scanner;
public class subsequence_having_given_sum_1_time_true_false_technique 
{
    public static ArrayList<ArrayList<Integer>> subset(int[] arr, int s)
    {
       ArrayList<Integer> curr = new ArrayList<Integer>();
       ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
       subsets(arr, 0, curr, ans, s);
       return ans;
    }
   
   public static boolean subsets(int[] arr, int i, ArrayList<Integer> curr, ArrayList<ArrayList<Integer>> ans, int s)
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
            ans.add(new ArrayList<Integer>(curr));
            return true;
         }
         return false;
      } 
      curr.add(arr[i]);
      if(subsets(arr, i+1, curr, ans, s)==true) return true;
      curr.remove(curr.size() - 1);
      if(subsets(arr, i+1, curr, ans, s)==true) return true;   
      return false;
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
    ArrayList<ArrayList<Integer>> subsets = subset(arr, s);
    System.out.println("Subsets with sum " + s + ":");
    System.out.println(subsets);
    
 }
      
}

package recursion;
import java.util.ArrayList;
import java.util.Scanner;
public class subsets 
{
   public static ArrayList<ArrayList<Integer>> subset(int[] arr)
   {
      ArrayList<Integer> curr=new ArrayList<Integer>();
      ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();
      subsets(arr,0,curr,ans);
      return ans;

   }
   public static void subsets(int[] arr,int i,ArrayList<Integer> curr,ArrayList<ArrayList<Integer>> ans)
   {
      if(i==arr.length)
      {
         ans.add(new ArrayList<Integer>(curr));
         return;
      }
      curr.add(arr[i]);
      subsets(arr,i+1,curr,ans);
      curr.remove(curr.size()-1);
      subsets(arr,i+1,curr,ans);
   }
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int k=sc.nextInt();
            arr[i]=k;
        }
        ArrayList<ArrayList<Integer>> subsets = subset(arr);
        System.out.println(subsets);

        
      }

}

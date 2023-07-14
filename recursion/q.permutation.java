package recursion;
import java.util.ArrayList;
public class permutation 
{
    public static  ArrayList<ArrayList<Integer>> permute(int[] nums)
    {
        ArrayList<Integer> curr=new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();
        back(nums,curr,ans);
        return ans;
    }

    public static void back(int[] nums,ArrayList<Integer> curr,ArrayList<ArrayList<Integer>> ans)
    {
        if(curr.size()==nums.length)
        {
            ans.add(new ArrayList<Integer>(curr));

        }
       for(int i:nums)
       {
        if(curr.contains(i))
        {
            continue;
        }
         curr.add(i);
         back(nums,curr,ans); 
         curr.remove(curr.size()-1);
       }  
    }
    public static void main(String[] args) {
        int[] arr={1,2,3};
         ArrayList<ArrayList<Integer>> a=permute(arr);
         System.out.println(a);
    }


}

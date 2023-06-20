import java.util.Arrays;
import java.util.Collections;
public class inbuilt_sort
{
    public static void bubble(Integer[] n)
    {
        int k=n.length;
        Arrays.sort(n,0,k,Collections.reverseOrder());
        for(int i=0;i<k;i++)
        {
            System.out.print(n[i]+" ");
        }
    }
    public static void main(String[] args) 
    {
    Integer[] n={5,4,8,7,1};
    bubble(n);
    }
}

import java.util.Arrays;
public class inbuilt_sort
{
    public static void bubble(int[] n)
    {
        int k=n.length;
        Arrays.sort(n,0,3);
        for(int i=0;i<k;i++)
        {
            System.out.print(n[i]+" ");
        }
    }
    public static void main(String[] args) 
    {
    int[] n={5,4,8,7,1};
    bubble(n);
    }
}

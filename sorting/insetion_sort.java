public class selection_sort
{
    public static void bubble(int[] n)
    {
        int k=n.length;
        for(int i=1;i<k;i++)
        {
            int temp=n[i];
            int j=i-1;
            while(j>=0 && n[j]>temp)
            {
                n[j+1]=n[j];
                j--;
                
            }
            n[j+1]=temp;
        }
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

package Strings;
import java.util.*;
public class print_characters
{
    public static void Strings(String str) 
    {
        for(int i=0;i<(str.length()/2);i++)
        {
            if(str.charAt(i)==str.charAt(str.length()-1-i))
            {
                continue;
            }
            else
            {
                System.out.println("not pallindrome");
                return;
            }
        }
        System.out.println("pallindrome");
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        Strings(str);

    } 
}

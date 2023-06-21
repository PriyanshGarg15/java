package Strings;
import java.util.*;
public class print_characters
{
    public static void Strings(String str) 
    {
        for(int i=0;i<str.length();i++)
        {
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        Strings(str);

    } 
}

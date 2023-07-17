//https://www.youtube.com/watch?v=reddjqY1gpE
// package questions;

// public class panagram 
// {
//     public static boolean rea(String str) {
//         str=str.toLowerCase();
//         System.out.println(str);
//         int[] arr=new int[26];
//         for(int i=0;i<str.length();i++)
//         {
//             arr[str.charAt(i)-'a']++;
//         }
//         for(int i=0;i<arr.length;i++)
//         {
//             if(arr[i]==0)
//             {
//                 return false;
//             }
//         }
//         return true;
        
//     }
//     public static void main(String[] args) {
//         String str="Thequickbrownfoxjumpsoverthelazydog";
//         Boolean s=rea(str);
//         if(s==true)
//         {
//             System.out.println("panagram");
//         }
//         else
//         {
//             System.out.println("not panagram");
//         }
        
//     }    
// }
package questions;
import java.util.HashSet;
public class panagram 
{
    public static boolean rea(String str) {
        HashSet<Character> set=new HashSet<>();
        for(int i='a';i<='z';i++)
        {
            set.add((char)i);
        }
        for(int i=0;i<str.length();i++)
        {
            set.remove(str.charAt(i));
            if(set.isEmpty())
            {
                return true;
            }
        }
        return false;
        
    }
    public static void main(String[] args) {
        String str="Thequickbrownfoxjumpsoverthelazydog";
        Boolean s=rea(str);
        if(s==true)
        {
            System.out.println("panagram");
        }
        else
        {
            System.out.println("not panagram");
        }
        
    }    
}

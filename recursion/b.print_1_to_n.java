package recursion.basic_problems;
import java.util.Scanner;
public class print_1_to_n {

    public static void printPriyansh(int n) {
        if (n <= 0) {
            return;
        }
        printPriyansh(n - 1);
        System.out.println(n);
        
    }

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        printPriyansh(n);
    }
}

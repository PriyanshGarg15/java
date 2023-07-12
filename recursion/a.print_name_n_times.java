package recursion.basic_problems;
import java.util.Scanner;
public class print_name_n_times {

    public static void printPriyansh(int n) {
        if (n <= 0) {
            return;
        }
        System.out.println("priyansh");
        printPriyansh(n - 1);
    }

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        printPriyansh(n);
    }
}

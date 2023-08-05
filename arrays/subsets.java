import java.util.ArrayList;
import java.util.List;

public class sunsequence_0f_array {
    public static void main(String[] args) {
        int[] array = {3, 2, 1};
        List<List<Integer>> subsequences = generateSubsequences(array);
        
        for (List<Integer> subsequence : subsequences) {
            System.out.println(subsequence);
        }
    }
    
    public static List<List<Integer>> generateSubsequences(int[] array) {
        List<List<Integer>> subsequences = new ArrayList<>();
        int n = array.length;
        int totalSubsets = 1 << n; // The total number of subsets is 2^n
        for (int i = 0; i< totalSubsets; i++) {
            List<Integer> subsequence = new ArrayList<>();
            System.out.println(subsequence);
            for (int j = 0; j < n; j++) 
            {
                if ((i & (1 << j)) != 0) {
                    subsequence.add(array[j]);
                }
            }
            
            subsequences.add(subsequence);
        }
        
        return subsequences;
    }
}

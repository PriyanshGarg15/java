package recursion;
public class check_string_pallindrome_or_not {

    private static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) {
            return true;
        }

        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String str = "madam";
        int start = 0;
        int end = str.length() - 1;
        boolean isPalin = isPalindrome(str,start,end);
        System.out.println("Is the string '" + str + "' a palindrome? " + isPalin);
    }
}

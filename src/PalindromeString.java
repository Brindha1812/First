public class PalindromeString
{

    public static boolean isPalindrome(String s) {
        int i , len = s.length();
        //int len = len1/2;
        for (i = 0; i <= len - i - 1; i++) {
            if (s.charAt(i) != s.charAt(len - i - 1))
                return false;
        }
        return true;
    }
    public static void main( String[] args)
    {
        PalindromeString ps = new PalindromeString();
        String str = "rotator";
        boolean value =  ps.isPalindrome(str);
        if (value == true)
            System.out.println("The given String is Palindrome.");
        else
            System.out.println("The Given String is not a Palindrome.");
    }
}

//Check Palindrome (String)
  public class PalindromeCheck {
    public static boolean isPalindrome(String str) {
        String rev = new StringBuilder(str).reverse().toString();
        return str.equals(rev);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("level")); // true
    }
}

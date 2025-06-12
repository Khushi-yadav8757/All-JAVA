// Check for Anagram Strings
 Q: Two strings are anagram if they contain the same characters in any order.//

import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "listen", str2 = "silent";

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if (Arrays.equals(ch1, ch2))
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
    }
}

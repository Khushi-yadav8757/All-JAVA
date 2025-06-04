//Find Duplicate Characters in a String
import java.util.HashMap;

public class DuplicateChars {
    public static void findDuplicates(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : map.keySet()) {
            if (map.get(ch) > 1)
                System.out.println(ch + ": " + map.get(ch));
        }
    }

    public static void main(String[] args) {
        findDuplicates("programming");
    }
}

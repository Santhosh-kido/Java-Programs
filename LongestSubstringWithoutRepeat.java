import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeat {
    public static void main(String[] args) {
        String s = "abcdefabcbb";
        int maxlen = 0;
        Set<Character> set = new HashSet<>();
        int l = 0;
        for (int r = 0; r < s.length(); r++) {
            if (set.contains(s.charAt(r))) {
                while (l < r && set.contains(s.charAt(r))) {
                    set.remove(s.charAt(l));
                    l++;
                }
            }
            set.add(s.charAt(r));
            maxlen = Math.max(maxlen, r - l + 1);
        }
        System.out.print(maxlen);
    }
}

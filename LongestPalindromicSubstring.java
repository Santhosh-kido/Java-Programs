public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s = "babad";
        String LPS = "";
        for (int i = 0; i < s.length(); i++) {
            int l = i;
            int r = i;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                l--;
                r++;
            }
            String palindrome = s.substring(l + 1, r);
            if (palindrome.length() > LPS.length()) {
                LPS = palindrome;
            }
            l = i;
            r = i + 1;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                l--;
                r++;
            }
            palindrome = s.substring(l + 1, r);
            if (palindrome.length() > LPS.length()) {
                LPS = palindrome;
            }
        }
        System.out.println(LPS);
    }
}

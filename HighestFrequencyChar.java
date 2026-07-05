public class HighestFrequencyChar {
    public static void main(String[] args) {
        String s = "engineering";
        int max = 0;
        char a = ' ';
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > max) {
                max = freq[i];
                a = (char)(i + 97);
            }
        }
        System.out.println("highest frequency of given string: " + a + " " + max);
    }
}

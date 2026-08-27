import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String x = "silent";
        String y = "listen";
        char[] a = x.toCharArray();
        char[] b = y.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if (Arrays.equals(a, b)) {
            System.out.println("anagram");
        } else {
            System.out.println("not anagram");
        }
    }
}

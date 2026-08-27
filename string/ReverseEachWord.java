public class ReverseEachWord {
    public static void main(String[] args) {
        String s = "indian institute of technology";
        String[] str = s.split(" ");
        for (int i = 0; i < str.length; i++) {
            char[] c = str[i].toCharArray();
            int l = 0;
            int r = c.length - 1;
            while (l < r) {
                char temp = c[l];
                c[l] = c[r];
                c[r] = temp;
                l++;
                r--;
            }
            str[i] = new String(c);
        }
        System.out.print(String.join(" ", str));
    }
}

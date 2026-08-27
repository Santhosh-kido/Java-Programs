public class RunLengthEncoding {
    public static void main(String[] args) {
        String str = "aaaaabbbbbbcccceeddeee";
        StringBuilder res = new StringBuilder();
        int count = 1;
        for (int i = 1; i <= str.length(); i++) {
            if (i < str.length() && str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                res.append(str.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        System.out.print(res);
    }
}

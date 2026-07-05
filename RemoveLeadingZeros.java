public class RemoveLeadingZeros {
    public static void main(String[] args) {
        String s = "00000123569";
        int ind = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                ind++;
            } else {
                break;
            }
        }
        System.out.println(s.substring(ind, s.length()));
    }
}

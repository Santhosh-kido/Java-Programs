public class UppercaseSecondHalf {
    public static void main(String[] args) {
        String s = "helloworld";
        int midSize = s.length() / 2;
        String upper = s.substring(midSize, s.length()).toUpperCase();
        System.out.println(s.substring(0, midSize) + upper);
    }
}

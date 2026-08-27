public class WordCountAndUppercaseHalf {
    public static void main(String[] args) {
        String arr = "The quick brown fox jumps over the lazy dog";
        System.out.println(arr.split(" ").length);
        String s = "helloworld";
        int midSize = s.length() / 2;
        System.out.println(s.substring(0, midSize) + s.substring(midSize).toUpperCase());
    }
}

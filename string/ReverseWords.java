public class ReverseWords {
    public static void main(String[] args) {
        String s = "Programming is fun";
        String[] str = s.split(" ");
        int start = 0;
        int end = str.length - 1;
        while (start < end) {
            String temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
        System.out.println(String.join(" ", str));
    }
}

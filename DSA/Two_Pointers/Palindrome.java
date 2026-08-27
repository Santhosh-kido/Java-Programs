package DSA.Two_Pointers;

public class Palindrome {
    public static void main(String[] args) {

        String str = "madam";
        boolean isPalin = true;

        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                isPalin = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println(isPalin ? "Palindrome" : "Not a Palindrome");

    }
}

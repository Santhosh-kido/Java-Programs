import java.util.Scanner;

public class RearrangeOddEvenDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = n + "";
        String odd = "";
        String even = "";
        for (int i = 0; i < str.length(); i++) {
            int a = str.charAt(i) - '0';
            if (a % 2 != 0) {
                odd += a;
            } else {
                even += a;
            }
        }
        System.out.println(odd + even);
        sc.close();
    }
}

import java.util.Scanner;
public class AbsDiffAndRearrangeOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = n + "";
        while (str.length() > 2) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length() - 1; i++) {
                int a = str.charAt(i) - '0';
                int b = str.charAt(i + 1) - '0';
                sb.append(Math.abs(a - b));
            }
            str = sb.toString();
        }
        System.out.println(str);
        str = n + "";
        String odd = "", even = "";
        for (int i = 0; i < str.length(); i++) {
            int a = str.charAt(i) - '0';
            if (a % 2 != 0) odd += a;
            else even += a;
        }
        System.out.println(odd + even);
    }
}

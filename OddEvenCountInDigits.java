import java.util.Scanner;

public class OddEvenCountInDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = n + "";
        String odd = "";
        String even = "";
        int oddCount = 0;
        int evenCount = 0;
        for (int i = 0; i < str.length(); i++) {
            int a = str.charAt(i) - '0';
            if (a % 2 != 0) {
                odd += a;
                oddCount++;
            } else {
                even += a;
                evenCount++;
            }
        }
        System.out.println(odd + oddCount + even + evenCount);
        sc.close();
    }
}

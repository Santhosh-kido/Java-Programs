import java.util.Scanner;
public class OddDigitSumAndPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digitOddSum = 0, temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            if (digit % 2 != 0) digitOddSum += digit;
            temp /= 10;
        }
        System.out.println(digitOddSum);
        temp = n; int res = 0;
        while (temp > 0) { res = (res * 10) + temp % 10; temp /= 10; }
        if (res == n) System.out.println(n + " is a Palindrome Number.");
        else System.out.println(n + " is not a Palindrome Number.");
    }
}

import java.util.Scanner;

public class OddDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digitOddSum = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 != 0) {
                digitOddSum += digit;
            }
            n /= 10;
        }
        System.out.println(digitOddSum);
        sc.close();
    }
}

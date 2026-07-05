import java.util.Scanner;
public class DigitSumEvenOddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digitSum = 0, temp = n;
        while (temp > 0) { digitSum += temp % 10; temp /= 10; }
        System.out.println(digitSum);
        int digitEvenSum = 0; temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            if (digit % 2 == 0) digitEvenSum += digit;
            temp /= 10;
        }
        System.out.println(digitEvenSum);
    }
}

import java.util.Scanner;

public class EvenDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digitEvenSum = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 == 0) {
                digitEvenSum += digit;
            }
            n /= 10;
        }
        System.out.println(digitEvenSum);
        sc.close();
    }
}

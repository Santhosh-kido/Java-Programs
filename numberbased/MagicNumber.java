import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            n /= 10;
            if (sum > 9 && n == 0) {
                n = sum;
                sum = 0;
            }
        }
        if (sum == 1) {
            System.out.print(sum + " is a magic number");
        } else {
            System.out.print(sum + " is not a magic number");
        }
        sc.close();
    }
}

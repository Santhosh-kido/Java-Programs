import java.util.Scanner;

public class NthPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int num = 2;
        while (temp > 0) {
            if (isPrime(num)) {
                temp--;
            }
            num++;
        }
        System.out.println(n + "th Prime Number is " + (num - 1));
        sc.close();
    }

    static boolean isPrime(int s) {
        for (int i = 2; i * i <= s; i++) {
            if (s % i == 0) {
                return false;
            }
        }
        return true;
    }
}

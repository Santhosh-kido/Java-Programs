import java.util.Scanner;

public class CountPrimesInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int primeCount = 0;
        for (int i = n; i < m; i++) {
            if (isPrime(i)) {
                primeCount++;
            }
        }
        System.out.println(primeCount);
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

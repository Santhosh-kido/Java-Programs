import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digitSum = 0;
        while (n > 0) {
            digitSum += n % 10;
            n /= 10;
        }
        System.out.println(digitSum);
        sc.close();
    }
}

import java.util.Scanner;

public class SumOfSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int positiveSquareSum = 0;
        for (int i = 1; i <= n; i++) {
            positiveSquareSum += (i * i);
        }
        System.out.print(positiveSquareSum);
        sc.close();
    }
}

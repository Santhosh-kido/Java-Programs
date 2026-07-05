import java.util.Scanner;

public class LeftAlignedNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int space = 1; space <= i - 1; space++) {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}

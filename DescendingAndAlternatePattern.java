import java.util.Scanner;
public class DescendingAndAlternatePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) System.out.print(j + " ");
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 0) System.out.print(0 + " ");
                else System.out.print(1 + " ");
            }
            System.out.println();
        }
    }
}

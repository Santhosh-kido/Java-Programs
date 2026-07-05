import java.util.Scanner;

public class BorderPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1) {
                    System.out.print(j + " ");
                } else if (i == 1 || i == n) {
                    System.out.print(n + " ");
                } else if (j == n) {
                    System.out.print(n + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}

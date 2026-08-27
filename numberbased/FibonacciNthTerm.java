import java.util.Scanner;

public class FibonacciNthTerm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
        if (n == 1) {
            System.out.print(a);
        } else if (n == 2) {
            System.out.print(b);
        } else {
            for (int i = 2; i < n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            System.out.print(c);
        }
        sc.close();
    }
}

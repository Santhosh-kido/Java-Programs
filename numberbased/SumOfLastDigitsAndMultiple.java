import java.util.Scanner;
public class SumOfLastDigitsAndMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            System.out.println((n1 % 10) + (n2 % 10));
            int n = sc.nextInt();
            int m = sc.nextInt();
            if (n % m == 0)
                System.out.println(n + " is an exact multiple of " + m);
            else
                System.out.println(n + " is not an exact multiple of " + m);
        sc.close();
    }
}

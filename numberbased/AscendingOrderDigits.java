import java.util.Scanner;

public class AscendingOrderDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = n + "";
        boolean isAsc = true;
        for (int i = 0; i < str.length() - 1; i++) {
            int a = str.charAt(i) - '0';
            int b = str.charAt(i + 1) - '0';
            if (a > b) {
                isAsc = false;
                break;
            }
        }
        if (isAsc) {
            System.out.println("Numbers are arranged in ascending order");
        } else {
            System.out.println("Numbers are not arranged in ascending order");
        }
        sc.close();
    }
}

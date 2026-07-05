import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int count = 0;
        while (temp > 0) {
            temp /= 16;
            count++;
        }
        System.out.print(count);
        sc.close();
    }
}

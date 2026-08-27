import java.util.Scanner;

public class ComplexDigitCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int input3 = sc.nextInt();
        int thousValue = input1 / 1000;
        int hundValue = (input2 / 100) % 10;
        int min = Integer.MAX_VALUE;
        int temp = input3;
        while (temp != 0) {
            min = Math.min(min, temp % 10);
            temp /= 10;
        }
        int sum = (thousValue * hundValue) + min;
        System.out.print(sum);
        sc.close();
    }
}

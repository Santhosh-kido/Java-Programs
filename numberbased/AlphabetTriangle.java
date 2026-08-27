import java.util.Scanner;

public class AlphabetTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char c = (char)(65 + n - 1);
        for (int i = n; i >= 1; i--) {
            for (int spaces = 1; spaces <= i - 1; spaces++) {
                System.out.print(" ");
            }
            char temp = c;
            for (int j = i; j >= 1; j--) {
                System.out.print(Character.toUpperCase(temp) + " ");
                temp--;
            }
            System.out.println();
        }
        sc.close();
    }
}

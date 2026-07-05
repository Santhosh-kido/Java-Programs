import java.util.Scanner;

public class NeighbourDiffOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = n + "";
        boolean neighDiff = true;
        for (int i = 0; i < str.length() - 1; i++) {
            int a = str.charAt(i) - '0';
            int b = str.charAt(i + 1) - '0';
            if (Math.abs(a - b) != 1) {
                neighDiff = false;
                break;
            }
        }
        if (neighDiff) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}

import java.util.LinkedHashSet;
import java.util.Scanner;
public class RemoveDuplicatesAndSquareSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num : arr) set.add(num);
        System.out.println(set);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int positiveSquareSum = 0;
        for (int i = 1; i <= n; i++) positiveSquareSum += (i * i);
        System.out.print(positiveSquareSum);
    }
}

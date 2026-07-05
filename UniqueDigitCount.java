import java.util.Scanner;
import java.util.HashMap;

public class UniqueDigitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        while (n > 0) {
            int digit = n % 10;
            map.put(digit, map.getOrDefault(digit, 0) + 1);
            n /= 10;
        }
        int uniqueCount = 0;
        for (int val : map.values()) {
            if (val == 1) {
                uniqueCount++;
            }
        }
        System.out.println(uniqueCount);
        sc.close();
    }
}

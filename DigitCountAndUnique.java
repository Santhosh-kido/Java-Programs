import java.util.Scanner;
import java.util.HashMap;
public class DigitCountAndUnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n, count = 0;
        while (temp > 0) { temp /= 16; count++; }
        System.out.print(count);
        HashMap<Integer, Integer> map = new HashMap<>();
        while (n > 0) {
            int digit = n % 10;
            map.put(digit, map.getOrDefault(digit, 0) + 1);
            n /= 10;
        }
        int uniqueCount = 0;
        for (int val : map.values()) if (val == 1) uniqueCount++;
        System.out.println(uniqueCount);
    }
}

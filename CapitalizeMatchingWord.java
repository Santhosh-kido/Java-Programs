import java.util.Arrays;

public class CapitalizeMatchingWord {
    public static void main(String[] args) {
        String str = "apple banana mango apple grape";
        String matchingWord = "apple";
        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(matchingWord)) {
                char c = arr[i].charAt(0);
                String u = (c + "").toUpperCase();
                arr[i] = u + arr[i].substring(1, arr[i].length());
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

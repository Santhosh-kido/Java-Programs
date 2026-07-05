public class SumOfNumbersInString {
    public static void main(String[] args) {
        String a = "Singt44t3eee33";
        int sum = 0;
        String res = "";
        for (char c : a.toCharArray()) {
            if (Character.isDigit(c)) {
                res += c;
            } else {
                if (!res.isEmpty()) {
                    sum += Integer.parseInt(res);
                    res = "";
                }
            }
        }
        if (!res.isEmpty()) {
            sum += Integer.parseInt(res);
        }
        System.out.println(sum);
    }
}

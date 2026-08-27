public class ReverseOddPositionWords {
    public static void main(String[] args) {
        String str = "I love programming in python language";
        String[] arr = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 1) {
                StringBuilder s = new StringBuilder(arr[i]);
                sb.append(s.reverse() + " ");
            } else {
                sb.append(arr[i] + " ");
            }
        }
        System.out.print(sb.toString().trim());
    }
}

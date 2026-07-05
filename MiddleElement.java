public class MiddleElement {
    public static void main(String[] args) {
        int[] a = {7, 8, 9, 10, 11, 12};
        int check = (a.length % 2 == 0) ? 1 : 0;
        if (check == 1) {
            int midSize = a.length / 2;
            System.out.println(a[midSize - 1] + " " + a[midSize]);
        } else {
            int midSize = a.length / 2;
            System.out.println(a[midSize]);
        }
    }
}

public class CountPosNegZero {
    public static void main(String[] args) {
        int[] arr = {20, -10, 15, 0, -85};
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positiveCount++;
            } else if (arr[i] < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }
        System.out.println(positiveCount);
        System.out.println(negativeCount);
        System.out.println(zeroCount);
    }
}

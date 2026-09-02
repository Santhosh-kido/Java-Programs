public class Practice {

    public static void main(String[] args) {
        int a = 12345;
        String s = Integer.toString(a);

        int maxSum = Integer.MIN_VALUE;

        for (int start = 0; start < s.length(); start++) {
            int currentSum = 0;

            for (int i = start; i < s.length(); i++) {
                int digit = Character.getNumericValue(s.charAt(i));

                if ((i - start) % 2 == 0) {
                    currentSum += digit;
                } else {
                    currentSum -= digit;
                }

                maxSum = Math.max(maxSum, currentSum);
            }
        }

        System.out.println("Max sum is: " + maxSum);
    }
}
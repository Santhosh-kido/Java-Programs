
import java.util.ArrayList;

public class MaxSubArraysum {
    public static void main(String[] args) {

        int[] arr = { -5, 2, 3 };
        ArrayList<Integer> result = findMaxSubarray(arr);
        System.out.print("The max sub array is : [ ");
        for(int i=0;i<result.size()-1;i++){
            System.out.print(result.get(i) +" ");
        }
        System.out.print("]");
        System.out.println("\nThe max Sum is "+result.get(result.size()-1));
    }

    public static ArrayList<Integer> findMaxSubarray(int[] arr) {

    int maxSum = arr[0];
    int curSum = arr[0];

    int start = 0;
    int end = 0;
    int tempStart = 0;

    for (int i = 1; i < arr.length; i++) {

        // Start a new subarray
        if (arr[i] > curSum + arr[i]) {
            curSum = arr[i];
            tempStart = i;
        }
        // Continue current subarray
        else {
            curSum += arr[i];
        }

        // Found a new maximum
        if (curSum > maxSum) {
            maxSum = curSum;
            start = tempStart;
            end = i;
        }
    }

    ArrayList<Integer> result = new ArrayList<>();

    for (int i = start; i <= end; i++) {
        result.add(arr[i]);
    }

    result.add(maxSum);

    return result;
}
}

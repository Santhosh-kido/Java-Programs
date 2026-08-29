package DSA.Two_Pointers;
import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        for (int a : arr) {
            System.out.print(a + " ");
            
        }
        int[] arrwithk = RotateArrayWithK(arr, 3);
        System.out.println(Arrays.toString(arrwithk));
    }
    public static int[] RotateArrayWithK(int[] arr, int k){

        int left = 0;
        int right = k-1;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return arr;
    }
}

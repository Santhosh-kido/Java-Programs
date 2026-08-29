package DSA.Two_Pointers;

public class WaterContainer {
    public static void main(String[] args) {

        int[] arr = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int curr_water;
        int max_water = 0;
        int height;
        int width;
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            width = right - left; // formula
            height = Math.min(arr[left], arr[right]);

            curr_water = width * height;

            max_water = Math.max(curr_water,max_water);

            if (arr[left] > arr[right]) {
                right--;
            } else {
                left++;
            }
        }
        System.out.println(max_water);

    }
}

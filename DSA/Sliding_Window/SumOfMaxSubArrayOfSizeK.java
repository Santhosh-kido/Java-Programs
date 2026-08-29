package DSA.Sliding_Window;

public class SumOfMaxSubArrayOfSizeK {    
    public static void main(String[] args) {
        
        int[] arr = {2,1,5,1,3,2};
        int k = 3;
        int win_sum =0;
        int max_sum;
        for(int i=0;i<k;i++){
            win_sum+=arr[i];
        }
        max_sum = win_sum;
    
        for(int i=k;i<arr.length;i++){
            win_sum += arr[i] - arr[i-k];
            max_sum = Math.max(win_sum,max_sum);
        }
        System.out.println(max_sum);        
    }
}

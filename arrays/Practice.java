
public class Practice {
    public static void main(String[] args) {

        int[] arr = {1,1,2,2,3,3,4,4,5,5};
        int left =0;
        for(int i=1;i<arr.length;i++){
            if(arr[left]!=arr[i]){
                left++;
                arr[left] = arr[i];
            }
        }
        for(int i=0;i<=left;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
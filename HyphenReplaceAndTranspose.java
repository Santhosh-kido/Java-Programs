import java.util.Arrays;
public class HyphenReplaceAndTranspose {
    public static void main(String[] args) {
        String str = "Emma-is-a-data-scientist";
        System.out.println(str.replace("-", "\n"));
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int m = matrix.length, n = matrix[0].length;
        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                result[i][j] = matrix[j][i];
        System.out.println(Arrays.deepToString(result));
    }
}

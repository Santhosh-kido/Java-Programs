import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.print(permute(nums));
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permutation = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        backtrack(new ArrayList<>(), nums, used, permutation);
        return permutation;
    }

    private static void backtrack(List<Integer> current, int[] nums, boolean[] used, List<List<Integer>> result) {
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                used[i] = true;
                current.add(nums[i]);
                backtrack(current, nums, used, result);
                current.remove(current.size() - 1);
                used[i] = false;
            }
        }
    }
}

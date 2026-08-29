import java.util.*;

public class Practice {

    static HashMap<Integer, List<Integer>> graph = new HashMap<>();
    static long beautySum = 0;
    static final int MOD = 1_000_000_007;

    public static void main(String[] args) {

        int[] par = { 0, 1, 1, 2, 2 };
        int[] values = { 2, 3, 6, 12, 27 };  // values[0] = value of node 1, etc.
        int n = 5;

        // Build the tree: node i's children list
        for (int i = 1; i <= n; i++) {
            graph.put(i, new ArrayList<>());
        }
        for (int i = 2; i <= n; i++) {
            int parent = par[i - 1];
            graph.get(parent).add(i);
        }
        System.out.println("Tree: " + graph);

        // DFS from root (node 1)
        subtreeDFS(1, values);

        System.out.println("Total beauty sum = " + (beautySum % MOD));
    }

    // Returns the list of all values in the subtree rooted at `node`
    static List<Integer> subtreeDFS(int node, int[] values) {
        List<Integer> myValues = new ArrayList<>();
        myValues.add(values[node - 1]);  // this node's own value

        for (int child : graph.get(node)) {
            List<Integer> childValues = subtreeDFS(child, values);
            myValues.addAll(childValues);
        }

        // Count perfect-square pairs within this node's full subtree
        int beauty = countPerfectSquarePairs(myValues);
        beautySum += beauty;

        System.out.println("Node " + node + " subtree values = " + myValues + " -> beauty = " + beauty);

        return myValues;
    }

    static int countPerfectSquarePairs(List<Integer> list) {
        int count = 0;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                long sum = (long) list.get(i) + list.get(j);
                if (isPerfectSquare(sum)) {
                    count++;
                }
            }
        }
        return count;
    }

    static boolean isPerfectSquare(long num) {
        if (num < 0) return false;
        long root = (long) Math.sqrt(num);
        // check nearby values too, to avoid floating point rounding errors
        for (long r = Math.max(0, root - 1); r <= root + 1; r++) {
            if (r * r == num) return true;
        }
        return false;
    }
}
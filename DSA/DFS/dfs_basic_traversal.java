package DSA.DFS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class dfs_basic_traversal {
      static HashMap<Integer, List<Integer>> graph = new HashMap<>();
    static HashSet<Integer> visited = new HashSet<>();

    public static void main(String[] args) {

        graph.putIfAbsent(100, new ArrayList<>());
        graph.putIfAbsent(200, new ArrayList<>());
        graph.putIfAbsent(300, new ArrayList<>());
        graph.putIfAbsent(400, new ArrayList<>());
        graph.putIfAbsent(500, new ArrayList<>());

        graph.get(100).add(200);
        graph.get(100).add(300);
        graph.get(200).add(400);
        graph.get(200).add(500);

        PrintDfs(100);
        System.out.println("\n"+dfs(100,300));

    }
    public static boolean dfs(int node,int target) {

        if(node==target) return true;

        for (int child : graph.get(node)) {
            if(dfs(child,target)) return true;
        }
        return false;
    }

    public static void PrintDfs(int node){

        if(visited.contains(node)) return;
        
        visited.add(node);
        System.out.print(node+" -> ");
        for(int child:graph.get(node)){
            PrintDfs(child);
        }
    }
}

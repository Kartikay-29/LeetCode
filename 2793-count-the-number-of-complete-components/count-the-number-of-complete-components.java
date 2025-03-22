import java.util.*;

class Solution {
    private List<List<Integer>> adj;
    private boolean[] visited;

    private void dfs(int curr, List<Integer> otherComps) {
        visited[curr] = true;
        otherComps.add(curr);
        for (int neighbor : adj.get(curr)) {
            if (!visited[neighbor]) {
                dfs(neighbor, otherComps);
            }
        }
    }

    public int countCompleteComponents(int n, int[][] edges) {
        adj = new ArrayList<>();
        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                List<Integer> otherComps = new ArrayList<>();
                dfs(i, otherComps);

                int m = otherComps.size();
                boolean gotIt = true;
                for (int node : otherComps) {
                    if (adj.get(node).size() != m - 1) {
                        gotIt = false;
                        break;
                    }
                }
                if (gotIt) ans++;
            }
        }
        return ans;
    }
}
class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        // Build adjacency list
        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        boolean[] visited = new boolean[n];
        int completeComponents = 0;

        // Traverse all nodes
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                Set<Integer> nodes = new HashSet<>();
                dfs(i, graph, visited, nodes);
                
                // Check if the component is complete
                if (isComplete(nodes, graph)) {
                    completeComponents++;
                }
            }
        }
        return completeComponents;
    }

    private void dfs(int node, List<List<Integer>> graph, boolean[] visited, Set<Integer> nodes) {
        visited[node] = true;
        nodes.add(node);
        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, graph, visited, nodes);
            }
        }
    }

    private boolean isComplete(Set<Integer> nodes, List<List<Integer>> graph) {
        int size = nodes.size();
        for (int node : nodes) {
            if (graph.get(node).size() != size - 1) {
                return false;
            }
        }
        return true;
    }
}

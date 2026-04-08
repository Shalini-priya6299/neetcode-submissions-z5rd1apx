
class Solution {
    public int countComponents(int n, int[][] edges) {
        // convert into adjacencyList
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i< n; i++){
            adj.add(new ArrayList<>());
        }

        for(int[] e: edges){
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }

        // traverse all nodes
        boolean[] visited = new boolean[n];
        int count = 0;
        for(int i = 0; i< n; i++){
            if(!visited[i]){
                bfs(i, adj, visited);
                count++;
            }
        }
       return count;
    }

    public void bfs(int start, List<List<Integer>> adj, boolean[] visited){
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(start);

        while(!q.isEmpty()){
            int node = q.poll();

            for(int nei: adj.get(node)){
                if(!visited[nei]){
                    visited[nei] = true;
                    q.offer(nei);
                }
            }
        }
    }
}
class Solution {
    public boolean validTree(int n, int[][] edges) {
        int totalEdges = edges.length;
        if(totalEdges == n-1 && EdgeComponent(edges,n) ==1 ){
            return true;
        }
        return false;
    }

    int EdgeComponent(int[][] edges, int n){
        //convert into adjacent list
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i< n; i++){
            adj.add(new ArrayList<>());
        }

        for(int[] e: edges){
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }

        boolean[] visited = new boolean[adj.size()];
        int count = 0;

        for(int i = 0; i< adj.size(); i++){
            if(!visited[i]){
                bfs(i, adj, visited);
                count++;
            }
        }
        return count;
    }

    void bfs(int start, List<List<Integer>> adj, boolean[] visited){
        Queue<Integer>q = new ArrayDeque<>();

        q.offer(start);
        visited[start] =true;

        while(!q.isEmpty()){
            int node = q.poll();

            for(int nei: adj.get(node)){
                if(!visited[nei]){
                    visited[nei] = true;
                    q.add(nei);
                }
            }
        }
    }
}

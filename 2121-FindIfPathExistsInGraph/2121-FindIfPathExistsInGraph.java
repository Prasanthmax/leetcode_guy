// Last updated: 14/07/2026, 14:44:21
class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        Queue<Integer> q=new LinkedList<>();
        boolean[] vis=new boolean[n];
        q.add(source);
        vis[source]=true;
        while(q.size()!=0){
            int k=q.remove();
            if(k==destination){
                return true;
            }
            for(int i:adj.get(k)){
                if(!vis[i]){
                    vis[i]=true;
                    q.add(i);
                }
            }
        }
        return false;
    }
}
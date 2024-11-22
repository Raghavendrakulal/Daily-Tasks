
import java.util.ArrayList;

public class dfs{
        public static void dfs(int node, boolean visited[],ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> list ){
        visited[node]=true;
        list.add(node);

        for(Integer adjnodes: adj.get(node)){
        if(visited[adjnodes]==false){
        dfs(adjnodes,visited,adj,list);
        
        }
        }
    }

    public ArrayList<Integer> dfsofgraph(int V,ArrayList<ArrayList<Integer>> adj){
    boolean visited= new Boolean[V+1];
    visited[0]=true;
    ArrayList<Integer> list= new ArrayList<>();
    dfs(0,visited,adj,list);
    return list;
    }
}
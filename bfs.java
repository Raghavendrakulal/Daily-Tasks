
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public  class bfs{
  public static ArrayList<Integer> bfsofgraph(int V,ArrayList<ArrayList<Integer>> adj ){
  
        ArrayList<Integer> bfs = new ArrayList<>();
        Queue<Integer> queue= new LinkedList<>();
        boolean[] visited= new boolean[V];
        visited[0]=true;
        queue.add(0);
        while(!queue.isEmpty()){
        int node=queue.poll();
        bfs.add(node);


        for(int adjnodes : adj.get(node)){
        if(visited[adjnodes]==false){
        visited[adjnodes]=true;
        queue.add(adjnodes);
        }
        }
        }
        return  bfs;

  }

}
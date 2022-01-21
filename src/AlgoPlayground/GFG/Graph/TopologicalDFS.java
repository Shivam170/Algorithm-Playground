package AlgoPlayground.GFG.Graph;

import java.util.ArrayList;
import java.util.Stack;

public class TopologicalDFS {
    void DFS(int u, Stack<Integer> st, boolean[] visited, ArrayList<ArrayList<Integer>> adj){
        visited[u] = true;
        for (int v : adj.get(u)) {
            if (!visited[v])
                DFS(v,st,visited,adj);
        }
        st.push(u);
    }
    void topological(int V, boolean[] visited,ArrayList<ArrayList<Integer>> adj){
        Stack<Integer> st = new Stack<>();
        for (int u = 0; u < V; u++) {
            if (!visited[u]){
                DFS(u,st,visited,adj);
            }
        }
        while (!st.isEmpty()){
            int el = st.pop();
            System.out.println(el+" ");
        }
    }
}

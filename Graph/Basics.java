import java.util.ArrayList;

public class Basics {

    public static class Edge {
        int v = 0;
        int w = 0;

        Edge(int v, int w) {
            this.v = v;
            this.w = w;
        }

        public String toString(){
            return "(" + this.v + " ," + this.w + ")";
        }
    }

    public static int N = 7;
    public static ArrayList<Edge>[] graph = new ArrayList[N];

    public static void addEdge(int u, int v, int w) {
        graph[u].add(new Edge(v, w));
        graph[v].add(new Edge(u, w));
    }

    public static void display(){

        //U -> [v,w][v,w]
        for(int i = 0; i < N; i++){
            System.out.print(i + "->");
            for(Edge e : graph[i]){
                System.out.print(e);
            }
            System.out.println();
        }
    }

    public static int findEdge(int u, int v){

        for(int i = 0 ; i < graph[u].size(); i++){
            Edge e = graph[u].get(i);
            if(e.v == v){
                return i;
            }
        }

        return -1;
    }

    public static void removeEdge(int u, int v){
        int idx1 = findEdge(u, v);
        int idx2 = findEdge(v, u);

        graph[u].remove(idx1);
        graph[v].remove(idx2);
    }

    public static void removeVtx(int u){
        while(graph[u].size() != 0){
            int n = graph[u].size();
            Edge e = graph[u].get(n - 1);
            removeEdge(u, e.v);
        }
    }

    public static boolean hasPath(int src, int dest, boolean[] vis){
        if(src == dest){
            return true;
        }

        vis[src] = true;
        boolean res = false;
        for(Edge e : graph[src]){
            if(!vis[e.v]){
                res = res || hasPath(e.v, dest, vis);
            }
        }

        return res;
    }

    public static int allPath(int src, int dest, boolean[] vis, String ans){
        if(src == dest){
            System.out.println(ans + dest);
        }

        int count = 0;
        vis[src] = true;
        for(Edge e : graph[src]){
            if(!vis[e.v]){
                count += allPath(e.v, dest, vis, ans + src);
            }
        }
        vis[src] = false;
        return count;
    }

    public static void printPreOrder(int src, boolean[] vis, String ans, int wsf){
        System.out.print(src + "- >" + ans + src + "@" + wsf);
        vis[src] = true;
        for(Edge e : graph[src]){
            if(!vis[e.v]){
                printPreOrder(e.v, vis, ans + src, wsf = e.w);
            }
        }
        vis[src] = false;
    }

    public static void printPostOrder(int src, boolean[] vis, String ans, int wsf){
        
        vis[src] = true;
        for(Edge e : graph[src]){
            if(!vis[e.v]){
                printPreOrder(e.v, vis, ans + src, wsf = e.w);
            }
        }
        System.out.print(src + "- >" + ans + src + "@" + wsf);
        vis[src] = false;
    }

    public static void main(String[] args) {
        for (int i = 0; i < N; i++)
            graph[i] = new ArrayList<>();
        addEdge(0, 1, 10);
        addEdge(0, 3, 10);
        addEdge(1, 2, 10);
        addEdge(2, 3, 10);
        addEdge(3, 4, 10);
        addEdge(4, 5, 10);
        addEdge(4, 6, 10);
        addEdge(5, 6, 10);

        display();

        boolean[] vis = new boolean[N];
        System.out.println(hasPath(0, 6, vis));
    }

}
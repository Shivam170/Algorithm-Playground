package AlgoPlayground.misc.RecursionBacktracking;

public class DFSOnGrid {
    static boolean[][] vis = new boolean[1001][1001];
    static int N,M;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};

    static void dfs(int x,int y){
        vis[x][y] = true;
        System.out.println(x+" "+y);
        for (int i = 0; i < 4; i++) {
            if (isValid(x+dx[i],y+dy[i]))
                dfs(x+dx[i],y+dy[i]);
        }
//        if (isValid(x-1,y))
//            dfs(x-1,y);
//
//        if (isValid(x,y+1))
//            dfs(x,y+1);
//
//        if (isValid(x+1,y))
//            dfs(x+1,y);
//
//        if (isValid(x,y-1))
//            dfs(x,y-1);
    }

    static boolean isValid(int x,int y){
        if(x<1 || x>N || y<1 || y>M)
            return false;

        return !vis[x][y];
    }
    public static void main(String[] args) {
        N=3;
        M=3;
        dfs(1,1);
    }
}

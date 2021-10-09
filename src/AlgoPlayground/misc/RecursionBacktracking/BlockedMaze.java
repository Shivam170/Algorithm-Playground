package AlgoPlayground.misc.RecursionBacktracking;

public class BlockedMaze {
    public static void main(String[] args) {
        int[][] grid ={{0,1,0,0},{0,0,0,0},{0,1,0,0},{0,1,1,0}};
        boolean[][] vis = new boolean[4][4];
        maze(grid,0,0,"",vis);
    }
    public static void maze(int[][] grid, int row, int col, String ans,boolean[][] vis ){
        if(row==grid.length-1 && col==grid[0].length-1){
            System.out.println(ans);
            return;
        }
        if (row<0 || col <0 || row>= grid.length|| col>=grid[0].length || vis[row][col] || grid[row][col]==1){
            return;
        }
        vis[row][col] = true;

        maze(grid,row-1,col,ans+"T",vis);
        maze(grid,row+1,col,ans+"D",vis);
        maze(grid,row,col+1,ans+"R",vis);
        maze(grid,row,col-1,ans+"L",vis);
        vis[row][col]=false;

    }
}

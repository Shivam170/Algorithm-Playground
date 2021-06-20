package AlgoPlayground.misc.RecursionBacktracking;

public class BlockedMaze {
    public static void main(String[] args) {
        int[][] grid ={{0,1,0,0},{0,0,0,0},{0,1,0,0},{0,1,1,0}};
        maze(grid,0,0,"");
    }
    public static void maze(int[][] grid, int row, int col, String ans ){
        if(row==grid.length-1 && col==grid[0].length-1){
            System.out.println(ans);
            return;
        }
        if (row<0 || col <0 || row>= grid.length-1 || col>=grid[0].length-1){
            return;
        }
        maze(grid,row-1,col,ans+"T");
        maze(grid,row+1,col,ans+"D");
        maze(grid,row,col+1,ans+"R");
        maze(grid,row,col-1,ans+"L");

    }
}

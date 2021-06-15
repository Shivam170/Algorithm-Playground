package AlgoPlayground.misc.RecursionBacktracking;

public class MazePath {
    //Find total number of ways from src to dst in a maze
    static void mazePath(int cr,int cc,int er,int ec,String ans){
        if(cr==er && cc==ec){
            System.out.println(ans);
        }
        if(cr>er || cc>ec){
            return;
        }
        mazePath(cr+1,cc,er,ec,ans+"V");
        mazePath(cr,cc+1,er,ec,ans+"H");
    }
    public static void main(String[] args) {
        mazePath(0,0,3,2,"");
    }
}

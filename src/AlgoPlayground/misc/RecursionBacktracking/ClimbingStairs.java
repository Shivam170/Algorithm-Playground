package AlgoPlayground.misc.RecursionBacktracking;

public class ClimbingStairs {
    //Print all the ways in which we can reach nth step of the stair using k jumps (Same as coin change)
    static void climbingStairs(int n,int curr,String ans,int k){
        if(curr==n){
            System.out.println(ans);
            return;
        }
        for(int i=1;i<=k;i++){
            if(curr+i<=n){
                climbingStairs(n,curr+i,ans+i+" ",k);
            }
        }
    }

    public static void main(String[] args) {
        climbingStairs(5,0,"",2);

    }
}

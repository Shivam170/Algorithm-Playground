package AlgoPlayground.misc.RecursionBacktracking;

public class ValidParentheses {
    //For a given n, generate valid parentheses
    static void validParentheses(int n , int open, int close, String ans){
        if(close>open) return;
        if(open>n) return;
        if(ans.length()==2*n){
            System.out.println(ans);
        }
        validParentheses(n,open+1,close,ans+"(");
        validParentheses(n,open,close+1,ans+")");
    }

    public static void main(String[] args) {
        validParentheses(3,0,0,"");

    }
}

package AlgoPlayground.GFG.Recursion;

public class SumDigit {
    int sumDigit(int n){
        if (n==0) return 0;
        return sumDigit(n/10)+n%10;
    }
}

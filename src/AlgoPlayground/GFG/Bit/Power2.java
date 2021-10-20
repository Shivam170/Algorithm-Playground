package AlgoPlayground.GFG.Bit;

public class Power2 {
    boolean naive(int n){
        if (n==0)return false;
        while (n!=1){
            if(n%2==1)
                return false;
            n=n/2;
        }
        return true;
    }
    boolean efficient(int n){
        return (n!=0)&&((n&(n-1))==0);
    }
}

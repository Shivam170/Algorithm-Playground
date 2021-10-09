package AlgoPlayground.GFG.Maths;

public class LCM {
    int lcmNaive(int a,int b){
        int res = Math.max(a,b);
        while(true){
            if(res%a==0 && res%b==0){
                break;
            }
            res++;
        }
        return res;
    }
    int gcdEuclidOpt(int a,int b){
        if(b==a){
            return a;
        }else{
            return gcdEuclidOpt(b,a%b);
        }
    }
    int lcmOpt(int a,int b){
        return a*b/gcdEuclidOpt(a,b);
    }
}

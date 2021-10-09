package AlgoPlayground.GFG.Maths;

public class GCD {
    public static void main(String[] args) {

    }
    int gcdNaive(int a,int b){
        int res = Math.min(a,b);
        while(res>0){
            if(a%res==0 && b%res==0){
                break;
            }
            res--;
        }
        return res;
    }
    int gcdEuclid(int a, int b){
        while(a!=b){
            if(a>b){
                a=a-b;
            }else{
                b=b-a;
            }
        }
        return a;
    }
    int gcdEuclidOpt(int a,int b){
        if(b==a){
            return a;
        }else{
            return gcdEuclidOpt(b,a%b);
        }
    }

}

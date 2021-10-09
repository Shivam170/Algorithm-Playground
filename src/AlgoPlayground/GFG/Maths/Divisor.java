package AlgoPlayground.GFG.Maths;

public class Divisor {
    void divisor(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0) System.out.println(i);
        }
    }

    void divisorEff(int n){
        for (int i=1;i*i<=n;i++){
            if(n%i==0){
                System.out.println(i);
                if(i!=n/i){
                    System.out.println(n/i);
                }
            }
        }
    }

    void divisorEffSort(int n){
        int i;
        for(i=1;i*i<n;i++){
            if(n%i==0) System.out.println(i);
        }
        for(;i>=1;i--){
            if(n%i==0) System.out.println(n/i);
        }
    }
}

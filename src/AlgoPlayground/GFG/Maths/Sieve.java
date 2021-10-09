package AlgoPlayground.GFG.Maths;

import java.util.Arrays;

public class Sieve {
        void sieve(int n){
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime,true);
        for(int i=2;i*i <=n; i++){
            if (isPrime[i]){
                for(int j=2*i;j<=n;j=j+i){
                    isPrime[j]=false;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if (isPrime[i])
                System.out.println(i);
        }
    }

    void sieveEff(int n){
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime,true);
        for(int i=2;i*i <=n; i++){
            if (isPrime[i]){
                for(int j=i*i;j<=n;j=j+i){
                    isPrime[j]=false;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if (isPrime[i])
                System.out.println(i);
        }
    }

    void sieveEffShort(int n){
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime,true);
        for(int i=2;i <=n; i++){
            if (isPrime[i]){
                System.out.println(i);
                for(int j=i*i;j<=n;j=j+i){
                    isPrime[j]=false;
                }
            }
        }
    }
}

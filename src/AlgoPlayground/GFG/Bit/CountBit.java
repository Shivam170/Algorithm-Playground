package AlgoPlayground.GFG.Bit;

public class CountBit {
    void naive(int n){
        int res=0;
        while (n>0){
            if ((n&1)==1) res++;
            n=n>>1;
        }
        while (n>0){
          res=res+(n&1);
          n=n>>1;
        }
    }
    //Brian Kerningam Algo
    void algo(int n){
        int res=0;
        while(n>0){
            n=(n&(n-1));
            res++;
        }
    }

    //LookUp Table Method
    int[] table=new int[256];
    void initialize(){
        table[0]=0;
        for (int i = 0; i < 256; i++) {
            table[i] = (i&1) + table[i/2];
        }
    }
    int count(int n){
        int res = table[n&0xff];
        n=n>>8;
        res=res+table[n&0xff];
        n=n>>8;
        res=res+table[n&0xff];
        n=n>>8;
        res=res+table[n&0xff];
        return res;
    }
}

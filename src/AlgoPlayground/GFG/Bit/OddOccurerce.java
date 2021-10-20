package AlgoPlayground.GFG.Bit;

public class OddOccurerce {
    void naiveOneOdd(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int c =0 ;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j]==arr[i]){
                    c++;
                }
            }
            if (c%2!=0){
                System.out.println(arr[i]);
            }
        }
    }
    void oneOddEff(int[] arr){
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res = res ^ arr[i];
        }
        System.out.println(res);
    }

    void twoOddEff(int[] arr){
        int xor=0,res1=0,res2=0;
        for (int k : arr) {
            xor = xor ^ k;
        }
        int sn = xor&(~(xor-1));
        for (int j : arr) {
            if ((sn & j) != 0) {
                res1 = res1 ^ j;
            } else {
                res2 = res2 ^ j;
            }
        }
        System.out.println(res1 + " and "+res2);
    }
}

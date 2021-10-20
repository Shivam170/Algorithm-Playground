package AlgoPlayground.GFG.Bit;

public class KthBit {
    void kthBit(int n,int k){
        if((n & (1<<(k-1)))!=0){
            System.out.println("yes");
        }else System.out.println("No");

        //Using right shift operator

        if(((n>>(k-1))&1)==1){
            System.out.println("Yes");
        }else System.out.println("No");
    }


}

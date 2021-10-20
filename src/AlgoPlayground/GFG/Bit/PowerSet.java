package AlgoPlayground.GFG.Bit;

public class PowerSet {
   static void powerSet(String str ){
        int n = str.length();
        int powSize = (int)Math.pow(2,n);
        for (int counter = 0; counter < powSize; counter++) {
            for (int i = 0; i < n; i++) {
                if((counter&(1<<i))!=0){
                    System.out.print(str.charAt(i));
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        powerSet("abc");
    }
}

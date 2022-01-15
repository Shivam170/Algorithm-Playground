package AlgoPlayground.GFG.String;

public class KMPAlgo {
    void KMP(String pat, String txt){
        int N = txt.length();
        int M = txt.length();
        int[] lps = new int[M];
        LPS.fillLPSEff(pat,lps);
        int i =0, j = 0;
        while(i<N){
            if (pat.charAt(j)==pat.charAt(i)){
                i++;
                j++;
            }
            if (j==M){
                System.out.print(i-j);
                j = lps[j-1];
            }else if (i < N && pat.charAt(j)!=txt.charAt(i)){
                if (j==0){
                    i++;
                }else {
                    j=lps[j-1];
                }
            }

        }
    }
}

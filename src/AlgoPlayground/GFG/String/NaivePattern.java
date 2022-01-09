package AlgoPlayground.GFG.String;

public class NaivePattern {
    void naiveSearching(String str, String pat) {
        int m = pat.length();
        int n = str.length();
        for (int i = 0; i <=n-m; i++) {
            int j;
            for(j=0;j<m;j++){
                if (pat.charAt(j)!=str.charAt(i+j))
                    break;
            }
            if (j==m)
                System.out.print(i+" ");
        }
    }

    void improvedNaive(String str, String pat){
        int n = str.length();
        int m = pat.length();
        for (int i = 0; i <= n-m;) {
            int j;
            for (j=0;j<m;j++){
                if (pat.charAt(j)!=str.charAt(i+j)){
                    break;
                }
            }
            if (j==m){
                System.out.print(i+" ");
            }
            if (j==0){
                i++;
            }else i=i+j;
        }
    }
}

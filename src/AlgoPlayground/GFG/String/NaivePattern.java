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
}

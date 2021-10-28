package AlgoPlayground.GFG.Recursion;

public class Permutation {
    void permute(String s,int i){
        if(i==s.length()-1){
            System.out.println(s);
            return;
        }
        for (int j = i; j < s.length(); j++) {
            swap(i,j,s);
            permute(s,i+1);
            swap(j,i,s);
        }
    }
    void swap(int i,int j,String s){
        // swap char at i and j
    }
}

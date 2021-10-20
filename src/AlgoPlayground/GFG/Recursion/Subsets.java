package AlgoPlayground.GFG.Recursion;

public class Subsets {
    void subsets(String s, String curr, int i){
        if(i==s.length()){
            System.out.println(s);
            return;
        }
        subsets(s,curr,i+1);
        subsets(s,curr+s.charAt(i),i+1);
    }
}

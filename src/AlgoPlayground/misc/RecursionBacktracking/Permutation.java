package AlgoPlayground.misc.RecursionBacktracking;

public class Permutation {
    static void permutation(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            permutation(str.substring(0,i)+str.substring(i+1),ans+str.charAt(i));
        }
    }

    public static void main(String[] args) {
        permutation("abcd","");
    }
}

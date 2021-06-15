package AlgoPlayground.leetcode;

public class LetterCombinationOfPhone {
    String[] arr  = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    void letterOfCombination(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        String roq = str.substring(1);
        int c = ch - '0';
        String code = this.arr[c];
        for (int i = 0; i < code.length(); i++) {
            letterOfCombination(roq,ans+code.charAt(i));
        }
    }
    public static void main(String[] args) {
        LetterCombinationOfPhone l = new LetterCombinationOfPhone();
        l.letterOfCombination("23","");
    }
}

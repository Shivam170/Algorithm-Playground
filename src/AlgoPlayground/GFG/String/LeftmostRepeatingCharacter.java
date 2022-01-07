package AlgoPlayground.GFG.String;

public class LeftmostRepeatingCharacter {
    int naiveLeftMost(String str){
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <str.length() ; j++) {
                if (str.charAt(i)==str.charAt(j))
                    return i;
            }
        }
        return -1;
    }

    int leftMost(String str){
        int[] count = new int[256];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        for (int i = 0; i < str.length(); i++) {
            if (count[str.charAt(i)]>1){
                return i;
            }
        }
        return -1;
    }
}

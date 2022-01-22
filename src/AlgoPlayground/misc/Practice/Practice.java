package AlgoPlayground.misc.Practice;

import java.util.HashMap;

public class Practice {
    public static String fractionToDecimal(int numerator, int denominator) {
        double res = (numerator + 0.0) / denominator;
        String ans = String.valueOf(res);
        boolean flag = false;
        int[] digit = new int[10];
        int start, end;
        start = 0;
        end = 0;
        for (int i = 0; i < ans.length(); i++) {
            if (ans.charAt(i) == '.') {
                flag = true;
                start = i + 1;
                continue;
            }
            if (flag) {
                if (digit[Character.getNumericValue(ans.charAt(i))] == 0) {
                    digit[Character.getNumericValue(ans.charAt(i))]++;
                } else {
                    end = i;
                    break;
                }

            }
        }
        if (end == 0) {
            return ans;
        } else {
            return ans.substring(0, start) + "(" + ans.substring(start, end) + ")";
        }

    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 4, 5, 6};
        System.out.println(fractionToDecimal(22, 7));
    }
}

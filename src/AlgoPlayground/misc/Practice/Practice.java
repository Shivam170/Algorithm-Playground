package AlgoPlayground.misc.Practice;

import java.util.Arrays;
import java.util.HashMap;

public class Practice {
    static long trappingWater(int arr[], int n) {
        int[] lMax = new int[n];
        int[] rMax = new int[n];
        lMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            lMax[i] = Math.max(lMax[i - 1], arr[i]);
        }
        System.out.println(Arrays.toString(lMax));
        rMax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rMax[i] = Math.max(arr[i], rMax[i + 1]);
        }
        System.out.println(Arrays.toString(rMax));
        long res = 0;
        for (int i = 1; i < n - 1; i++) {
            res = res + Math.min(lMax[i], rMax[i]) - arr[i];
        }
        return res;
    }

    public static String[] divideString(String s, int k, char fill) {
        int size = (int)(Math.ceil((s.length()+0.0)/k));
        String[] arr = new String[size];
        int i =0;
        int c = 0;
        while(i+k-1<=s.length()-1){
            StringBuilder str= new StringBuilder();
            for(int j = i;j<i+k;j++)
                str.append(s.charAt(j));
            arr[c++]= str.toString();
            i=i+k;
        }
        if(i<=s.length()-1){
            StringBuilder str = new StringBuilder();
            for(int j = i; j<s.length();j++)
                str.append(s.charAt(j));

            int r = k-str.length();
            str.append(String.valueOf(fill).repeat(Math.max(0, r)));
            arr[c] = str.toString();
        }
        return arr;
    }

    public static void main(String[] args) {
        divideString("ctoyjrwtngqwt",8,'n');
    }
}

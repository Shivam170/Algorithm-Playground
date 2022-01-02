package AlgoPlayground.GFG.Hashing;

import java.util.HashMap;
import java.util.Map;

public class Frequency {
    void printFreq(int[] arr, int n){
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            //Check if the element was seen before
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]){
                    flag = true;
                    break;
                }
            }
            if (flag) continue;
            int freq = 1;
            for (int j = i+1; j < n; j++) {
                if (arr[i]==arr[j]){
                    freq++;
                }
            }
            System.out.println(arr[i]+" "+freq);
        }
    }
    void printFreqHash(int[] arr, int n){
        HashMap<Integer,Integer> h = new HashMap<>();
        for (int x : arr)
            h.put(x,h.getOrDefault(x,0)+1);
        for (Map.Entry<Integer,Integer> e : h.entrySet())
            System.out.println(e.getKey()+" "+e.getValue());
    }
}

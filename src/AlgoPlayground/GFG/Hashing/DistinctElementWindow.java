package AlgoPlayground.GFG.Hashing;

import java.util.HashMap;

public class DistinctElementWindow {
    void printDistinct(int[] arr, int n, int k) {
        for (int i = 0; i <= n - k; i++) {
            int count = 0;
            for (int j = 0; j < k; j++) {
                boolean flag = false;
                for (int l = 0; l < j; l++) {
                    if (arr[i + j] == arr[i + l]) {
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    count++;
                }
            }
            System.out.print(count + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {10,20,10,10,30,40};
        printDistinctEfficient(arr,arr.length,4);
    }
    static void printDistinctEfficient(int[] arr, int n, int k){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < k; i++) {
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        System.out.print(hm.size()+" ");
        for (int i = k; i < n; i++) {
            hm.put(arr[i-k],hm.get(arr[i-k])-1);
            if (hm.get(arr[i-k])==0){
                hm.remove(arr[i-k]);
            }
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
            System.out.print(hm.size() + " ");
        }

    }
}

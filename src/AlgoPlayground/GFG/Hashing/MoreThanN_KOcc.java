package AlgoPlayground.GFG.Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MoreThanN_KOcc {
    public static void main(String[] args) {

    }

    void printN_K(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int i = 1, count = 1;
        while (i < n) {
            while (i < n && arr[i] == arr[i - 1]) {
                count++;
                i++;
            }
            if (count > n / k) {
                System.out.println(arr[i - 1] + " ");
            }
            count = 1;
            i++;
        }
    }

    void printN_KEff(int[] arr, int n, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int x : arr) {
            hm.put(x, hm.getOrDefault(x, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> e : hm.entrySet()) {
            if (e.getValue() > n / k) {
                System.out.println(e.getKey() + " ");
            }
        }
    }

    // Do the code for O(nk) approach
}

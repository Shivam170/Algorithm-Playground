package AlgoPlayground.GFG.Stack;

import java.util.ArrayDeque;

public class LargestRectHist {
    void naive(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] >= arr[i])
                    curr += arr[i];
                else break;
            }
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] >= arr[i]) curr += arr[i];
                else break;
            }
            res = Math.max(res, curr);
        }
        System.out.println(res);
    }

    static int getMaxArea(int[] arr) {
        ArrayDeque<Integer> s = new ArrayDeque<>();
        int res = 0;
        int tp;
        int curr;
        for (int i = 0; i < arr.length; i++) {

            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                tp = s.pop();
                curr = arr[tp] * (s.isEmpty() ? i : (i - s.peek() - 1));
                res = Math.max(res, curr);
            }
            s.push(i);
        }
        while (!s.isEmpty()) {
            tp = s.pop();
            curr = arr[tp] * (s.isEmpty() ? arr.length : arr.length - s.peek() - 1);
            res = Math.max(res, curr);
        }
        return res;
    }
}

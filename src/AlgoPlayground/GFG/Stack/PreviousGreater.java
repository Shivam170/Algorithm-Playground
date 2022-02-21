package AlgoPlayground.GFG.Stack;

import java.util.ArrayDeque;

public class PreviousGreater {
    void naive(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] > arr[i]) {
                    System.out.print(arr[j] + " ");
                    break;
                }
            }
            if (j == -1) System.out.print(-1 + " ");
        }
    }

    void prevGreater(int[] arr) {
        ArrayDeque<Integer> s = new ArrayDeque<>();
        s.push(arr[0]);
        System.out.print(-1+" ");
        for (int i = 1; i < arr.length; i++) {
            while (!s.isEmpty() && s.peek() <= arr[i]) {
                s.pop();
            }
            int pg = s.isEmpty() ? -1 : s.peek();
            System.out.print(pg);
            s.push(arr[i]);
        }
    }
}

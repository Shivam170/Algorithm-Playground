package AlgoPlayground.GFG.Stack;

import java.util.ArrayDeque;

public class NextGreater {
    void naive(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j;
            for (j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    System.out.print(arr[j]);
                    break;
                }
            }
            if (j == arr.length) System.out.print(-1 + " ");
        }
    }

    void nextGreater(int[] arr, int n) {
        ArrayDeque<Integer> s = new ArrayDeque<>();
        s.push(arr[n - 1]);
        System.out.print(-1 + " ");
        for (int i = n - 1; i >= 0; i--) {
            while (!s.isEmpty() && s.peek() <= arr[i])
                s.pop();

            int ng = s.isEmpty() ? -1 : s.peek();
            System.out.print(ng + " ");
            s.push(arr[i]);
        }
    }
}

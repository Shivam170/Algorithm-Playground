package AlgoPlayground.GFG.Stack;

import java.util.ArrayDeque;

public class StockSpan {
    void printSpan(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int span = 1;
            for (int j = i - 1; j >= 0 && arr[j] <= arr[i]; j--) {
                span++;
            }
            System.out.println(span + " ");
        }
    }

    void stockSpan(int[] arr) {
        ArrayDeque<Integer> s = new ArrayDeque<>();
        s.push(0);
        System.out.print(1 + " ");
        for (int i = 1; i < arr.length; i++) {
            int span;
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            span = s.isEmpty() ? i + 1 : i - s.peek();
            System.out.print(span + " ");
            s.push(i);
        }
    }
}

package AlgoPlayground.GFG.Stack;

import java.util.ArrayDeque;

public class getMinDes {
    ArrayDeque<Integer> ms;
    ArrayDeque<Integer> as;

    getMinDes(){
        ms = new ArrayDeque<>();
        as = new ArrayDeque<>();
    }
    void pop() {
        if (ms.peek() == as.peek()) {
            as.pop();
        }
        ms.pop();
    }

    void push(int x) {
        ms.push(x);
        if (ms.peek() <= as.peek()) {
            as.push(x);
        }
    }

    int getMin() {
        return as.peek();
    }
}

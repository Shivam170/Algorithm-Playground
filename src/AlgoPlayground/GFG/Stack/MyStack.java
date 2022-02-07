package AlgoPlayground.GFG.Stack;

public class MyStack {
    int[] arr;
    int cap;
    int top;

    MyStack(int c) {
        top = -1;
        cap = c;
        arr = new int[c];
    }

    void push(int x) {
        arr[++top] = x;
    }

    int pop() {
        return arr[top--];
    }

    int size() {
        return top + 1;
    }

    boolean isEmpty() {
        return top == -1;
    }
}


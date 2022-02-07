package AlgoPlayground.GFG.Stack;

//public class MyStack {
//    int[] arr;
//    int cap;
//    int top;
//
//    MyStack(int c) {
//        top = -1;
//        cap = c;
//        arr = new int[c];
//    }
//
//    void push(int x) throws Exception {
//        if (top == cap - 1) {
//            throw new Exception("Stack overflow");
//        }
//        arr[++top] = x;
//    }
//
//    int pop() throws Exception {
//        if (top == -1) {
//            throw new Exception("Stack underflow");
//        }
//        return arr[top--];
//    }
//
//    int size() {
//        return top + 1;
//    }
//
//    boolean isEmpty() {
//        return top == -1;
//    }
//}

import jdk.dynalink.NamedOperation;

import java.util.ArrayList;

//public class MyStack {
//    ArrayList<Integer> al = new ArrayList<>();
//
//    void push(int x) {
//        al.add(x);
//    }
//
//    int pop() {
//        int res = al.get(al.size() - 1);
//        al.remove(al.size() - 1);
//        return res;
//    }
//    int peek(){
//        return al.get(al.size()-1);
//    }
//    int size(){
//        return al.size();
//    }
//}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class MyStack {
    Node head;
    int size;

    MyStack() {
        head = null;
        size = 0;
    }

    int size() {
        return size;
    }

    boolean isEmpty() {
        return head == null;
    }

    void push(int x) {
        Node node = new Node(x);
        node.next = head;
        head = node;
        size++;
    }

    int pop() throws Exception {
        if (head == null) {
            throw new Exception("Underflow");
        }
        int data = head.data;
        head = head.next;
        size--;
        return data;
    }

    int peek() throws Exception {
        if (head == null) {
            throw new Exception("Underflow");
        }
        return head.data;
    }

}

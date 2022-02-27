package AlgoPlayground.GFG.Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianStream {
    void printMedians(int[] arr){
        // s -> Max Heap g -> Min Heap
        PriorityQueue<Integer> g = new PriorityQueue<>();
        PriorityQueue<Integer> s = new PriorityQueue<>(Collections.reverseOrder());
        s.add(arr[0]);
        System.out.print(arr[0]+" ");
        for (int i = 1; i < arr.length; i++) {
            int x = arr[i];
            if (s.size()>g.size()){
                if (s.peek()>x){
                    g.add(s.poll());
                    s.add(x);
                }else g.add(x);
                System.out.print((double) (s.peek()+g.peek())/2);
            }else {
                if (x <= s.peek())
                    s.add(x);
                else {
                    g.add(x);
                    s.add(g.poll());
                }
                System.out.print(s.peek()+" ");
            }
        }
    }
}

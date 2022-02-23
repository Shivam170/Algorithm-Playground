package AlgoPlayground.GFG.Tree.BinarySearchTree;

import java.util.TreeSet;

public class CeilingLeftSide {
    void printCeiling(int[] arr, int n ){
        System.out.print(-1+" ");
        for (int i = 1; i < n; i++) {
            int diff = Integer.MAX_VALUE;
            for (int j = 0; j < i; j++) {
                if (arr[j]>=arr[i])
                    diff = Math.min(diff,arr[j]-arr[i]);
            }
            if (diff==Integer.MAX_VALUE)
                System.out.print(-1+" ");
            else System.out.print(arr[i]+diff+" ");
        }
    }
    void ceilLeft(int[] arr, int n){
        System.out.print(-1+" ");
        TreeSet<Integer> s = new TreeSet<>();
        s.add(arr[0]);
        for (int i = 1; i < n; i++) {
            if (s.contains(s.ceiling(arr[i])))
                System.out.print(s.ceiling(arr[i])+" ");
            else System.out.print(-1+" ");
            s.add(arr[i]);
        }
    }
}

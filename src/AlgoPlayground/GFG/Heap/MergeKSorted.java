package AlgoPlayground.GFG.Heap;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class Triplet implements Comparable<Triplet> {
    int val, aPos, vPos;

    Triplet(int v, int ap, int vp) {
        val = v;
        aPos = ap;
        vPos = vp;
    }


    @Override
    public int compareTo(Triplet triplet) {
        if (val <= triplet.val)
            return -1;
        else
            return 1;
    }
}

public class MergeKSorted {
    List<Integer> merge(List<List<Integer>> arr) {
        List<Integer> res = new ArrayList<>();
        PriorityQueue<Triplet> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.size(); i++) {
            pq.add(new Triplet(arr.get(i).get(0), i, 0));
        }
        while (!pq.isEmpty()) {
            Triplet curr = pq.poll();
            res.add(curr.val);
            int ap = curr.aPos, vp = curr.vPos;
            if (vp + 1 < arr.get(ap).size()) {
                pq.add(new Triplet(arr.get(ap).get(vp + 1), ap, vp + 1));
            }
        }
        return res;
    }
}

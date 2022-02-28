package AlgoPlayground.GFG.SegmentTree;

public class SegmentTree {
    int N;
    int[] arr = new int[N];
    int[] tree = new int[4 * N];

    void update(int ss, int se, int i, int si, int diff) {
        if (i < ss || i > se) return;
        tree[si] += diff;
        if (se > ss) {
            int mid = (ss + se) / 2;
            update(ss, mid, i, 2 * si + 1, diff);
            update(mid + 1, se, i, 2 * si + 2, diff);
        }
    }

    int getSum(int qs, int qe, int ss, int se, int si) {
        if (se < qs || ss > qe) return 0;
        if (qs <= ss && qe >= se) return tree[si];
        int mid = (ss + se) / 2;
        return getSum(qs, qe, ss, mid, 2 * si + 1) + getSum(qs, qe, mid + 1, se, 2 * si + 2);
    }

    int constructST(int ss, int se, int si) {
        if (ss == se) {
            tree[si] = arr[ss];
            return arr[ss];
        }
        int mid = (ss + se) / 2;
        tree[si] = constructST(ss, mid, 2 * si + 1) + constructST(mid + 1, se, 2 * si + 2);
        return tree[si];
    }
}

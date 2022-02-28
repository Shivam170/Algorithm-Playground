package AlgoPlayground.GFG.SegmentTree;

public class BIT {
    int n;
    int[] bITree = new int[n + 1];
    int[] arr = new int[n];

    void update(int i, int x) {
        int diff = x - arr[i];
        arr[i] = x;
        i = i + 1;
        while (i <= n) {
            bITree[i] += diff;
            i = i + i & (-i);
        }
    }

    int getSum(int i) {
        i = i + 1;
        int res = 0;
        while (i > 0) {
            res = res + bITree[i];
            i = i - (i & (-i));
        }
        return res;
    }
}

package AlgoPlayground.GFG.Greedy;

import java.util.Arrays;

class Item implements Comparable<Item> {
    int wt, val;

    public Item(int wt, int val) {
        this.wt = wt;
        this.val = val;
    }

    @Override
    public int compareTo(Item item) {
        //Decreasing order
        return item.val * this.wt - this.val * item.wt;
    }
}

public class FractionalKnapsack {
    public static void main(String[] args) {
        Item[] arr = {new Item(10, 60), new Item(40, 40), new Item(20, 100), new Item(30, 120)};
        int W = 50;
        System.out.println(fractionalKnapsack(arr, W));
    }

    static double fractionalKnapsack(Item[] arr, int W) {
        Arrays.sort(arr);
        double res = 0;
        for (Item item : arr) {
            if (item.wt <= W) {
                res = res + item.val;
                W = W - item.wt;
            } else {
                res = res + item.val * ((double) W / (double) item.val);
                break;
            }
        }
        return res;
    }
}

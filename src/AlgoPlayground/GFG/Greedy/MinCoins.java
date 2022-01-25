package AlgoPlayground.GFG.Greedy;

import java.util.Arrays;

public class MinCoins {
    int minCoin(int[] coins, int n, int amount) {
        Arrays.sort(coins);
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (coins[i] <= amount) {
                int c = amount / coins[i];
                res = res + c;
                amount = amount - c * coins[i];
            }
            if (amount == 0) break;
        }
        return res  ;
    }
}

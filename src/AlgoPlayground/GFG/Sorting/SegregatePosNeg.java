package AlgoPlayground.GFG.Sorting;

public class SegregatePosNeg {
    void segregatePosNeg(int[] arr, int n){
        int[] temp = new int[n];
        int i = 0;
        for (int j = 0; j < n; j++) {
            if (arr[j] < 0){
                temp[i]=arr[j];
                i++;
            }
        }
        for (int j = 0; j < n; j++) {
            if (arr[j]>=0){
                temp[i]=arr[j];
                i++;
            }
        }
        for (int j = 0; j < n; j++) {
            arr[j] = temp[j];
        }
    }
}

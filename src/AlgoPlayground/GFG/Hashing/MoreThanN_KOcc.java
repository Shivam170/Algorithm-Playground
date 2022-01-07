package AlgoPlayground.GFG.Hashing;

import java.util.Arrays;

public class MoreThanN_KOcc {
    public static void main(String[] args) {

    }
    void printN_K(int[] arr, int n, int k){
        Arrays.sort(arr);
        int i = 1, count = 1;
        while(i<n){
            while(i<n && arr[i]==arr[i-1]){
                count++;
                i++;
            }
            if (count>n/k){
                System.out.println(arr[i-1]+" ");
            }
            count=1;
            i++;
        }
    }
}

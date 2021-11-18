package AlgoPlayground.GFG.Array;

public class LeftRotate {
    //Left Rotate By One
    void lRotateOne(int[] arr, int n){
        int temp = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
    }
    //Left Rotate By d

    //Naive Solution
    void leftRotate(int[] arr, int n, int d){
        for (int i = 0; i < d; i++) {
            lRotateOne(arr,n);
        }
    }

    //Better Solution
    void leftRotate2(int[] arr, int n, int d){
        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        for (int i = d; i < n; i++) {
            arr[i-d] = arr[i];
        }
        for (int i = 0; i < d; i++) {
            arr[n-d+i] = temp[i];
        }
    }

    //Reversal Algorithm

    void leftRotate3(int[] arr, int n, int d){
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }

    void reverse(int[] arr,int low,int high){
        while(low<high){
            int temp =arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

}

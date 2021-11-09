package AlgoPlayground.GFG.Sorting;

public class BubbleSort {
    void swap(int i,int j,int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    void effBubbleSort(int[] arr,int n){
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    swap(j,j+1,arr);
                    swapped = true;
                }
            }
            if(swapped==false){
                break;
            }
        }
    }
    void bubbleSort(int[] arr ,int n ){
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j]>arr[j+1]){
                    swap(j,j+1,arr);
                }
            }
        }

    }
}

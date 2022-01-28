package AlgoPlayground.misc.Practice;

import java.util.HashMap;

public class Practice {
    public static int print2largest(int[] arr,int N)
    {
        int largest,secondLargest;
        secondLargest = -1;
        largest = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        System.out.println(largest);
        for(int i = 0;i<arr.length;i++){
            if(arr[i]!=largest && arr[i]>secondLargest){
                secondLargest=arr[i];
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1};
        System.out.println(print2largest(arr, 5));
    }
}

package AlgoPlayground.GFG.Array;

public class LargestElement {
    static int getLargest(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            boolean flag = true;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j]>arr[i]){
                    flag=false;
                    break;
                }
            }
            if(flag == true) return i;
        }
        return -1;
    }

    static int getLargestEff(int arr[]){
        int res = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>arr[res]){
                res=i;
            }
        }
        return res;
    }
}

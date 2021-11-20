package AlgoPlayground.GFG.Searching;

public class LastOccurrence {
    // Recursive Solution
    int lastOcc(int[] arr, int low, int high, int x,int n){
        if (low > high) return -1;
        int mid = (low + high)/2;
        if (x>arr[mid]) {
            return lastOcc(arr,mid+1,high,x,n);
        }else if(x<arr[mid]){
            return lastOcc(arr,low,mid-1,x,n);
        }else {
            if (mid==n-1||arr[mid]!=arr[mid+1]){
                return mid;
            }else return lastOcc(arr,mid+1,high,x,n);
        }
    }

    // Iterative Solution
    int lastOccIter(int[] arr, int n, int x){
        int low = 0, high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if (arr[mid]>x){
                high = mid -1;
            }else if (arr[mid]<x){
                low = mid +1;
            }else {
                if (mid==n-1 || arr[mid]!=arr[mid+1]){
                    return mid;
                } else low = mid+1;
            }
        }
        return -1;
    }
}

package AlgoPlayground.GFG.Searching;

public class SearchInfiniteSortedArray {
    // Naive Solution : O(pos) Time Complexity and O(1) Auxiliary Space
    int search(int[] arr, int x){
        int i=0;
        while(true){
            if(arr[i]==x) return i;
            if (arr[i] > x) return -1;
            i++;
        }
    }

    // Efficient Solution : O(log(pos)) Time Complexity and O(1) Auxiliary Space

    int bSearch(int[] arr , int x ){
        if (arr[0]==x) return 0;
        int i =1;
        while (arr[i] < x){
            i=i*2;
            if (arr[i]==x) return i;
            return BinarySearch.recursiveBinarySearch(arr,(i/2) +1,i-1,x);
        }
        return -1;
    }
}

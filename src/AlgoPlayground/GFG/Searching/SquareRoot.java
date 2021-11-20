package AlgoPlayground.GFG.Searching;

public class SquareRoot {
    // Naive Solution

    int naive (int x){
        int i = 1;
        while(i*i <=x){
            i++;
        }
        return i-1;
    }

    // Using Binary Search

    int sqRootFloor(int x){
        int low = 1, high = x, ans =-1;
        while(low<=high){
            int mid=  (low+high)/2;
            int mSq = mid*mid;
            if(mSq==x) return mid;
            else if (mSq > x) {
                high = mid-1;
            }else{
                low = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }
}

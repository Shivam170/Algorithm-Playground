package AlgoPlayground.GFG.Recursion;

public class SubsetSumProblem {
    int coubtSubsets(int arr[], int n, int sum){
        if(n==0){
            return (sum==0)?1:0;
        }
        return coubtSubsets(arr,n-1,sum)+coubtSubsets(arr,n-1,sum-arr[n-1]);
    }
}

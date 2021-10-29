package AlgoPlayground.GFG.Array;

public class Operaiton {
    int insert (int  arr[],int n, int x, int cap, int pos){
        if(n==cap) return n;
        int idx = pos-1;
        for (int i = n-1;i>=idx;i--){
            arr[i+1]=arr[i];
        }
        arr[idx]=x;
        return n+1;
    }
    int delete(int arr[], int n, int x){
        int i;
        for (i=0;i<n;i++){
            if(arr[i]==x){
                break;
            }
        }
        if (i==n) return n;
        for (int j = i; j < n-1; j++) {
         arr[j]=arr[j+1];
        }
        return n-1;
    }
}

package AlgoPlayground.GFG.Sorting;

public class MergeTwoSortedArrays {
    void merge(int[] a,int[] b){
        int m = a.length;
        int n = b.length;
        int i=0,j=0;
        while(i<m && j<n){
            if (a[i]<=b[j]){
                System.out.print(a[i]+" ");
                i++;
            }else {
                System.out.print(b[j]+" ");
                j++;
            }
        }
        while(i<m){
            System.out.print(a[i]+" ");
            i++;
        }
        while(j<n){
            System.out.print(b[j]+" ");
            j++;
        }
    }
}

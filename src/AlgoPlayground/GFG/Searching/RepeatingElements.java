package AlgoPlayground.GFG.Searching;

import java.util.Arrays;

public class RepeatingElements {
    int superNaiveSol(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
    int naiveSol(int[] arr){
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]==arr[i+1])
                return arr[i];
        }
        return -1;
    }

    int effSol(int[] arr ){
        boolean visited[] = new boolean[arr.length];
        Arrays.fill(visited,false);
        for (int i = 0; i < arr.length; i++) {
            if (visited[arr[i]]){
                return arr[i];
            }
            visited[arr[i]]=true;
        }
        return -1;
    }

    int repeatingElement(int[] arr){
        int slow = arr[0]+1,fast = arr[0]+1;
        do{
            slow = arr[slow]+1;
            fast = arr[arr[fast]+1]+1;
        }while (slow!=fast);
        slow=arr[0]+1;
        while(slow!=fast){
            slow=arr[slow]+1;
            fast=arr[fast]+1;
        }
        return slow-1;
    }
}

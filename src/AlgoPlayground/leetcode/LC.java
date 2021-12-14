package AlgoPlayground.leetcode;
// Every question is solvable. You just need to give time.

public class LC {

}
class Solution {
    public static void main(String[] args) {
        int[] arr = {5,2,4,2,7,4,3,3,1,1};
        System.out.println(wateringPlants(arr,10));
    }
    public static  int wateringPlants(int[] plants, int capacity) {
        int ans = 0;
        int rem = 5;
        for(int i = 0;i<plants.length;i++){
            if(rem<plants[i]){
                ans+=i+(i+1);
                rem = capacity;
                rem=rem-plants[i];
            }else{
                ans+=1;
                rem=rem-plants[i];
            }

        }
        return ans;
    }
}
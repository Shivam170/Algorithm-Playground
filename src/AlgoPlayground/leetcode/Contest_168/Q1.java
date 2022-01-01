package AlgoPlayground.leetcode.Contest_168;

// My Solution

class Q1 {
    public int findNumbers(int[] nums) {
        int ans = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if((digits(nums[i]))%2==0){
                ans++;
            }
        }
        return ans;
    }
    public int digits(int num){
        int c = 0;
        while(num!=0){
            num=num/10;
            c++;
        }
        return c;
    }
}
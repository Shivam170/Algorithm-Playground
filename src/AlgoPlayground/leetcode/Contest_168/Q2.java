package AlgoPlayground.leetcode.Contest_168;
import java.util.TreeMap;


class Q2 {
    public boolean isPossibleDivide(int[] nums, int k) {
        if((nums.length)%k!=0)
            return false;
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }


        for(int key : map.keySet()){
            if(map.get(key)==0){
                continue;
            }

            while(map.get(key)!=0){
                for(int i = key;i<(key+k);i++ ){
                    if(map.get(i)==null || map.get(i)==0)
                        return false;
                    else{
                        map.put(i, map.get(i) - 1);
                    }
                }
            }
        }
        return true;
    }
}
import java.util.*;

class Solution {
    public int firstMissingPositive(int[] nums) {
        
        Set<Integer> set = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            // positive number only
            if(nums[i] > 0){
                set.add(nums[i]);
            }
        }

        int count =1;
        while(set.contains(count))        {
            count++;
        }

        return count;
        
    }
}

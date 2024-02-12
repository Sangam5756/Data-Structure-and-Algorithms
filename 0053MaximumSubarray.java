class Solution {
    public int maxSubArray(int[] nums) {
          int max = Integer.MIN_VALUE;
        int curr=0;
        for(int i=0; i<nums.length; i++){                
                
                if( curr < 0){
                curr= 0;
            }
            curr +=nums[i];
            max =Math.max(curr, max);
        }
        return max;
    }
}

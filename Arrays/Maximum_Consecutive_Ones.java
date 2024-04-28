// https://leetcode.com/problems/max-consecutive-ones/submissions/
// Problem Statement: Given an array that contains only 1 and 0 return the count of maximum consecutive ones in the array.

// TC - O(N)
// SC - O(1)
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int count =0;
        for(int i=0; i<nums.length;i++){

            if(nums[i] == 1)
            {
                count++;
            }else{
                count = 0;
            }
            max = Math.max(max,count);
        }
        return max;
    }
}

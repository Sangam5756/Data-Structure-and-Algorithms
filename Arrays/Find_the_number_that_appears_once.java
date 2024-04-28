// Given a non-empty array of integers arr, every element appears twice except for one. Find that single one..
// leetcode -https://leetcode.com/problems/single-number/description/

// BruetForce Solution

class Solution {
    public int singleNumber(int[] nums) {

        int count =0;
        int ans = 0;
        for(int i=0; i<nums.length; i++){
             count =0;
            for(int j=0; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }

            if(count == 1) 
            {
                ans = nums[i];
                return nums[i];
            }
                
        }


        return ans;

    }
}




// Optimal Solution
class Solution {
    public int singleNumber(int[] nums) {

    //   Using X or Operation
    int xor = 0;

    for(int i=0; i<nums.length; i++){
        xor ^=nums[i];
    }
    return xor;
    }
}

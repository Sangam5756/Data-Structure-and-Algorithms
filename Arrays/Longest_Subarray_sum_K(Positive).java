// Approach
//1. Initialization:
// left and right are pointers to keep track of the current subarray's boundaries.
// sum represents the current subarray's total sum.
// maxLen stores the length of the longest subarray with a sum equal to k.

//2. Main Loop (While right < n):
// The main loop iterates over the array using the right pointer.
// As long as right is within the array's bounds, continue with the process.

// 3.Inner Loop (While left <= right and sum > k):
// This inner loop adjusts the left pointer when the current subarray's sum is greater than k.
// It moves left to the right, reducing the sum by subtracting the leftmost element, until sum is less than or equal to k.

// 4.Check for Matching Subarray:
// If sum equals k, update maxLen with the length of the current subarray (right - left + 1).

// 5.Move right Pointer:
// Increment right to consider the next element.
// If right is within bounds, add the value at the new right position to sum.
// Return maxLen:

// Once the loop is done, return maxLen, representing the length of the longest subarray with sum k.



class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;

        int left =0 , right =0;

        int sum  = nums[0];

        int maxLen = 0;

        while( right < n){

            while(left <= right && sum > k){
                sum -=nums[left];
                left++;
            }
            
            if(sum == k){
                maxLen = Math.max(maxLen, right-left+1);
            }

            right++;

            if(right<n) sum+=nums[right];
        
        }

            
        return maxLen;
    }
}

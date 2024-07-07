// Given an integer array nums that does not contain any zeros, find the largest positive integer k such that -k also exists in the array.
// Return the positive integer k. If there is no such integer, return -1.


// OPTIMAL
class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int left =0;
        int right = nums.length-1;
        int max =Integer.MIN_VALUE;

        while(left < right){
            int sum = nums[left] + nums[right];

            if(sum ==0){
                max =Math.max(max,nums[right]);
                left++;
                right--;
            }else if( sum < 0){
                left++;
            }else{
                right--;
            }
        }
    return max!= Integer.MIN_VALUE ? max:-1;
    }
}



// Better
class Solution {
    public int findMaxK(int[] nums) {
        HashSet<Integer> hm = new HashSet<>();

        for(int i : nums){
            hm.add(i);
        }

        // check the
        int max = -1;
        for(int x : hm){
            if( x > 0  && hm.contains(-x)){
                max = Math.max(max, x);
            }
        }
        return max;
    }
}





// Brutforce
class Solution {
    public int findMaxK(int[] nums) {
        int maxPositive = -1; // Variable to track the maximum positive number for which the negative exists
        
        // Loop through the array
        for (int i = 0; i < nums.length; i++) {
            // If the number is positive, we need to check if the corresponding negative number exists
            if (nums[i] > 0) {
                // Look through the array to find the corresponding negative number
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] == -nums[i]) {
                        // If found, update the maxPositive if this number is greater
                        if (nums[i] > maxPositive) {
                            maxPositive = nums[i];
                        }
                        break; // We found the negative counterpart, no need to check further
                    }
                }
            }
        }
        
        return maxPositive; // If no positive number has a corresponding negative, this will be -1
    }
}

class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int s) {
        int j=1;
        int count= 0;
        
        
        for(int i=0; i<nums.length; i++){
            int product =1;
            for(int k=i;k<nums.length; k++){
                product*=nums[k];
                if(product < s){
                    count++;
                }else{
                    break;
                }

            }
            j++;
        }

        return count;

    }
}

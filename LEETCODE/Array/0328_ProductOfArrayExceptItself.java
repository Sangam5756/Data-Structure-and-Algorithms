class Solution {
    public int[] productExceptSelf(int[] nums) {

        int prefixstart[] = new int[nums.length];

        prefixstart[0] = 1;
        for(int i=1; i<nums.length; i++){
            prefixstart[i] = prefixstart[i-1] * nums[i-1];
        }

        
        int prefixend[] = new int[nums.length];

        prefixend[prefixend.length-1] =1;
        for(int i=nums.length-2; i>=0; i--){
            prefixend[i] = prefixend[i+1] * nums[i+1];
        }

        int res [] = new int[nums.length];
         
         
    for(int i=0; i< nums.length; i++){
        res[i] = prefixstart[i] * prefixend[i];
    }
        return res;   
    }
}

class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n =nums.length;
        // prefix array to store start elements product
        int prefixstart[] = new int[n];

        // prefix array to store end elements product
        int prefixend[] = new int[n];
        int res[] = new int[n];

        prefixstart[0] = nums[0];
        for(int i=1; i<n; i++){
            prefixstart[i] =prefixstart[i-1] * nums[i];
        }

        prefixend[n-1] =nums[n-1];
        for(int i=n-2; i>=0; i--){

            prefixend[i] =prefixend[i+1] * nums[i];
        }

        
        res[0] = prefixend[1];
        res[n - 1] = prefixstart[n - 2];

        for(int i=1; i< n-1; i++){

            res[i] =  prefixstart[i-1] * prefixend[i+1];
        }
         
         return res;

        
        
    }
}
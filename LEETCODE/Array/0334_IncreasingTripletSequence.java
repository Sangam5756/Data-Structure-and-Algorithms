class Solution {
    public boolean increasingTriplet(int[] nums) {

         if(nums == null || nums.length<3)
            return false;

            int n = nums.length;
        int num1 = Integer.MAX_VALUE;
        int num2 = Integer.MAX_VALUE;

        

        for(int i=0; i<n; i++){

            int num3 = nums[i];

            // first will ask to the num1
            if( num3 <= num1){

                num1 = num3;

            }else if(num3 <= num2){ // here we asked to num2  
                
                num2 = num3;
            }else{
                return true;
            }
        }
        
        return false;

        
        
    }
}
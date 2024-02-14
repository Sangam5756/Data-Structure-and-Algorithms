class Solution {
    public int finalValueAfterOperations(String[] nums) {
        int count =0;
        for(int i=0; i<nums.length;i++){
            if( nums[i].equals("++X") || nums[i].equals("X++") ){
                count++;
            }else{
                count--;
            }
        }
        return count;
    }
}

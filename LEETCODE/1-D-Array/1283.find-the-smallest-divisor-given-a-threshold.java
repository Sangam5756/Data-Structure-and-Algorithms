class Solution {

      public  int sumByD(int[] arr, int div) {
        int n = arr.length; //size of array
        //Find the summation of division values:
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Math.ceil((double)(arr[i]) / (double)(div));
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        
        int n = nums.length;

        int sum =0;
        int max= Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            max = Math.max(nums[i], max);
        }

             int low = 1, high = max;

             while(low <= high){
                int mid = (low + high)/2;
                if(sumByD(nums,mid) <=threshold){
                    high = mid-1;
                }else{
                    low =mid+1;
                }
             }
             return low;
       
        
    }
}

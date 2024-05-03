
 // BrutForce
class Solution {
    public void sortColors(int[] nums) {

       
        Arrays.sort(nums);

        
        
    }
}

// Better
class Solution {
    public void sortColors(int[] nums) {

        
        int count0 =0;
         int count1 =0;
        int count2=0;
        for(int i =0; i<nums.length; i++){
            if(nums[i] == 0){
                count0++;
            }else if(nums[i] == 1){
                count1++;
            }else{
                count2++;
            }
        }

        for(int i=0; i<count0; i++){
            nums[i] =0;
        }

        for(int i=count0; i<count0+count1; i++){
            nums[i] =1;
        }

        for(int i=count0+count1; i<nums.length; i++){
            nums[i] =2;
        }
        

        
        
    }
}


// OPTIMAL
class Solution {
    public void sortColors(int[] nums) {
        // Three pointers: low, mid, high
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        // Loop through the array and sort elements
        while (mid <= high) {
            if (nums[mid] == 0) {
                // Swap nums[low] and nums[mid] and move pointers
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                // Move mid pointer when value is 1
                mid++;
            } else if (nums[mid] == 2) {
                // Swap nums[mid] with nums[high], decrement high
                swap(nums, mid, high);
                high--; // don't increment mid because the swapped value from high needs to be checked
            }
        }
    }

    // Swap helper function to swap elements in the array
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

//1 BRUETFORCE   SPACE O(K)   TIME 0(N)

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int[] temp = new int[k]; // Adjusted the size of temp array for the first k elements

        // Copy the first k elements into temp
        for (int i = 0; i < k; i++) {
            temp[i] = nums[i];
        }

        // Shift the array
        for (int i = n - 1; i >= k; i--) {
            nums[i] = nums[i - k];
        }

        // Put the array back to the original
        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }
    }
}






//2. OPTIMAL SPACE O(1)   TIME 0(N)
class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}

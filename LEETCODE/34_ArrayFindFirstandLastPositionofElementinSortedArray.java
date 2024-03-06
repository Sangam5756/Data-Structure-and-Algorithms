class Solution {
    public int[] searchRange(int[] nums, int target) {
        int s = 0, e = nums.length - 1;
        int[] result = new int[]{-1, -1};

        // Search for the left boundary
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] == target) {
                result[0] = mid;
                e = mid - 1; // Move to the left half
            } else if (nums[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        // Search for the right boundary
        s = 0; // Reset start
        e = nums.length - 1; // Reset end
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] == target) {
                result[1] = mid;
                s = mid + 1; // Move to the right half
            } else if (nums[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        return result;
    }
}

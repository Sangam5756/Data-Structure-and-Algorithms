class Solution {
    public int search(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;
        // mid is target then return mid
            if (arr[mid] == target) {
                return mid;
            }
            // check the left part is sorted or not if not then eleminate it
            if (arr[low] <= arr[mid]) {
                if (arr[low] <= target && target <= arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            // check the right part is sorted or not  if not then eliminiate it.
            } else {
                if (arr[mid] <= arr[high]) {

                    if (arr[mid] <= target && target <= arr[high]) {
                        low = mid+1;
                    }else{
                        high =mid-1;
                    }
                }
            }

        }
        return -1;
    }
}

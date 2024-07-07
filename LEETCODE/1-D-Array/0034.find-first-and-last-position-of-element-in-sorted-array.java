class Solution {
    public int[] searchRange(int[] arr, int target) {

            // first element
            int first = -1;
        for(int i=0; i<arr.length;i++){
            if( arr[i]  == target){
                first = i;
            }
        }

        int last = -1;
        for(int i=arr.length-1; i>=0;i--){
            if( arr[i]  == target){
                last = i;
            }
        }

        int ans[] = new int[2];
        ans[0] = last;
        ans[1] = first;
        return ans;

    }
}

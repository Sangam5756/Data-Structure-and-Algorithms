class Solution {
    public boolean binarySearch(int[] arr, int target){
        
        int low = 0;
        int high = arr.length - 1;

        while( low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == target){
                return true;
            }
            else if(arr[mid] > target){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return false;

    }


    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i=0; i<matrix.length; i++){

            if(matrix[i][0] <= target && target<=matrix[i][m-1]){
                return binarySearch(matrix[i],target);
            }


        }
        return false;

    }
}

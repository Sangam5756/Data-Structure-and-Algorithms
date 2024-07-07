

class Solution{
    
    // Function to find floor of x
    // arr: input array
    // n is the size of array
    static int findFloor(long arr[], int n, long x)
    {
        int ans =-1; 
        for(int i=0; i<arr.length; i++){
            if(arr[i] <= x){
                ans =i;    
            
            }
        }
        return ans;
        
    }
    
}

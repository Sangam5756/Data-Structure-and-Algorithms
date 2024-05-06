// BRUETFORCE APPROACH
// TC - O(N^3)
// SC - O(1)
class Solution {
    public int maxSubArray(int[] arr) {
        int max =Integer.MIN_VALUE;
        int sum =0; 
        int n = arr.length;

        for(int i=0; i<n;i++)
        {

            for(int j=0; j<n;j++)
            {
                 sum =0;
                for(int k=i; k<=j; k++)
                {
                    sum +=arr[k];
                }

                max = Math.max(max,sum);
            }
        }
        return max;
    }
}


// BETTER APPROACH
// TC - O(N^2)
// SC - O(1)

class Solution {
    public int maxSubArray(int[] arr) {
        int max =Integer.MIN_VALUE;
        int sum =0; 
        int n = arr.length;

        for(int i=0; i<n;i++)
        {
            sum =0;
            
          for(int j=0; j<n;j++)
            {
                sum +=arr[j];
                

                max = Math.max(max,sum);
            }
        }
        return max;
    }
}



//OPTIMAL APPROACH
// TC - O(N)
// SC - O(1)
class Solution {
    public int maxSubArray(int[] arr) {
        int max  = Integer.MIN_VALUE;
        int sum  = 0;

        for(int i=0; i<arr.length; i++){
            sum +=arr[i];
           
           
             if(sum > max){
                max = sum;
            }
             if(sum < 0){
                sum =0;
            }

        }
        return max;
    }
}

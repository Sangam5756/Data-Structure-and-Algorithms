// BRUETFORCE  
// TIME COMPLEXITY  -  O ( N^2 )
// SPACE COMPLEXITY - O(1)
class Solution {
    public int majorityElement(int[] v) {
        
       int n = v.length;

        for (int i = 0; i < n; i++) {
            //selected element is v[i]
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                // counting the frequency of v[i]
                if (v[j] == v[i]) {
                    cnt++;
                }
            }

            // check if frquency is greater than n/2:
            if (cnt > (n / 2))
                return v[i];
        }

        return -1;

    }
}

// BETTER                 HASHMAP     LOOP
// TIME COMPLEXITY  -  O ( nlogn )  + O(n)

                //    Storing Elements
// SPACE COMPLEXITY -    O(n)

class Solution {
    public int majorityElement(int[] nums) {
        
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        for(int i=0; i<nums.length; i++){
            int num = nums[i];
            if(hm.containsKey(num)){
                hm.put(num,hm.get(num)+1);
            }else{
                hm.put(num,1);
            }
        }
        int ans =0;

        Set<Integer> keySet = hm.keySet();

        for(Integer key : keySet){
            if(hm.get(key) > (nums.length/2)){
                ans = key;
            }
        }

        return ans;


    }
}


// OPTIMAL           (USING MOORES VOTING ALGORITHM)  
// TIME COMPLEXITY  -  O(n)               
// SPACE COMPLEXITY -  O(1)


class Solution {
    public int majorityElement(int[] nums) {

        int n = nums.length;
        int count = 0;
        int el =0;

        for(int i=0; i<n; i++){
            if(count == 0){
                count= 1;
                el = nums[i]; 
            }else if(nums[i] == el){
                count++;
            }else{
                count--;
            }
        }

        // Verify the el is our majarity element
        int count1 =0;
        for(int i=0; i<n; i++){
            if(nums[i] == el){
                count1++;
            }
        }

        if(count1 > (n/2)){
            return el;
        }

        return -1;
       


    }
}

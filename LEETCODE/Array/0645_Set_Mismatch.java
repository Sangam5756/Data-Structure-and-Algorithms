class Solution {
    public int[] findErrorNums(int[] nums) {
        
        HashMap<Integer, Integer> hm = new HashMap<>();
// created the map we add elements of nums into the map
         for(int i : nums){
             hm.put(i  , hm.getOrDefault(i, 0)+1);
        }
// create the list to add element which occures more than 1
// simply by checking the frequency
        List<Integer> list1 = new ArrayList<>();
        for(int i : hm.keySet()){
            if(hm.get(i) > 1){
                list1.add(i);
                
            }
        }

    // let add element which not in the map
        int n = nums.length;
        for(int i =1; i<=n; i++){
            if(!hm.containsKey(i)){
                list1.add(i);
                break;
            }
        }
    
// convert the list to array then we return  it

        int arr[] = new int[list1.size()];
        for(int i=0; i<list1.size(); i++){
            arr[i] = list1.get(i);

        }
        return arr;
    }
}

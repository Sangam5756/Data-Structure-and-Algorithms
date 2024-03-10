class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
     
        HashMap<Integer, Integer> hm = new HashMap<>();
// First we create map and add element of num1 in that
        for( int i : nums1){
            hm.put(i, hm.getOrDefault(i, 0 )+1);
        }
// second create list & iterate on num2 and check that element is present in the
// map if present the add to list and remove from the hashmap
        List<Integer> list1 = new ArrayList<>();
        for(int i : nums2){
            if(hm.containsKey(i)){
                list1.add(i);
                hm.remove(i);
            }
        }
//  here we create the ans array to convert list to array we store 
// list element in the array and then return the array
        int ans[] = new int[list1.size()];
        for(int i=0; i<list1.size(); i++ ){
            ans[i] = list1.get(i);
        }
        return ans;
    }
}

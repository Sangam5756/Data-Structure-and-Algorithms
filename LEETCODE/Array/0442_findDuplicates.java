class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0;i <nums.length; i++){
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) +1);
        }

        Set<Integer> keyset =  hm.keySet();
        List<Integer> list = new ArrayList<>();
        for(int i : keyset){
            if(hm.get(i) > 1){
                list.add(i);
            }
        }
        return list;
    }
}

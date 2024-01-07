// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/?envType=study-plan-v2&envId=leetcode-75
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        int max = -1;
        for(int i : candies){            
            if( i > max){
                max =i;
            }
        }

        // take list to store result
        List<Boolean> res = new ArrayList<>();

        for(int i: candies){
            if( i + extraCandies >= max){
                res.add(true);            
            }else{
                res.add(false);
            }
        }
        return res;
    }
}
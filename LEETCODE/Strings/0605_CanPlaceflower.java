// https://leetcode.com/problems/can-place-flowers/?envType=study-plan-v2&envId=leetcode-75
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int l = flowerbed.length;  //length of flower array

        if( n==0){   //n ==0 means to place at start 
            return true;
        }
        for(int i=0; i< l; i++){
            if(flowerbed[i] == 0 ){  //when 0 then place
                // check left side is 0 and ith also 0
                boolean left = (i == 0) || (flowerbed[i-1] == 0); 
                // check right side is 0 and ith also 0
                boolean right = (i == l-1 ) || (flowerbed[i+1]==0);

                // place when left right is 0
                if( left && right){
                    flowerbed[i]=1;
                    n--; // after placing decrease n
                // at last when n becomes 0 then exit returning true
                    if(n == 0){
                        return true;
                    }
                }
            }
        }

        return false;

        
    }
}
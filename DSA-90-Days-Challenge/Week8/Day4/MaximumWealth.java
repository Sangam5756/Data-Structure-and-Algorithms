class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int max =0;

        for(int i=0; i<accounts.length;i++){
            int m =0;
            int arr[] =accounts[i];
            for(int j=0;j<arr.length;j++){
                m+=accounts[i][j];
                                
            }
            max = Math.max(max, m);

        }
        return max;
    }
}

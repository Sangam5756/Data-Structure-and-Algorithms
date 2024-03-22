class Solution {
    public void setZeroes(int[][] matrix) {
        int  n =matrix.length;
        int m = matrix[0].length;

        // check for zeroes in col and row 
        int col0= 1;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j] == 0){
                    // mark the row
                    matrix[i][0] = 0;
                    // mark the col
                    if( j!= 0){
                        matrix[0][j] = 0;
                    }else{
                        col0 =0;
                    }
                }
            }
        }
        
        // check mark and convert all into 0`s
        for(int i =1 ; i<n; i++){
            for(int j=1; j<m; j++){
                if(matrix[i][0] == 0 || matrix[0][j] ==0){
                    matrix[i][j] = 0;
                }
            }
        }
        // deal with first row
        if(matrix[0][0] == 0){
            for(int i =0; i<m; i++){
                matrix[0][i]=0;
            }
        }
        // deal with col
        if(col0 == 0){
            for(int i=0; i<n; i++){
                matrix[i][0] = 0;
            }
        }
        

    }
}

import java.util.*;


public class Nqueens{
    public static boolean issafe(char board[][], int row, int col){

        // Vertical Up
        for(int i =row -1 ; i>=0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        // Digonal Left
        for(int i = row -1, j =col -1;i>=0 && j>=0 ;j-- , i--){
            if(board[i][j] == 'Q'){
                return false;
            }

        }
        // Diagonal Right

        for(int i =row-1, j =col+1; i>=0 && j<board.length; i-- , j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        return true;


    }
    public static void nQueen(char board[][],int row){
        

        if(row == board.length){
            print(board);
            return;
        }

        for(int j=0;j<board.length;j++){
                if(issafe(board, row , j)){
                board[row][j] ='Q'; 
                nQueen(board,row+1);//function call
                board[row][j] ='X';  // backtracking step
                }
                

        }
    }

    public static void print(char arr[][]){
        System.out.println("--------------chess-----------------");
        
        for(int i =0; i<arr.length; i++){
            for(int j =0; j<arr.length;j++){
                System.out.print(arr[i][j] +"  ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){

        int n =4;
        char chess[][] =new char[n][n];

        for(int  i=0;i<n;i++){
            for(int j=0; j<n; j++){
                chess[i][j] ='X';
            }
        }
        nQueen(chess,0);
    }
}

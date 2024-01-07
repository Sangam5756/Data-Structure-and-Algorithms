import java.util.*;

public class PrintOneSolutionOfNqueen{


    public static boolean nQueen(char chess[][], int i){
        if(i==chess.length){
            print(chess);
            return true;
        }

        for(int j=0;j<chess.length;j++){
            chess[i][j] ='Q';
            if(nQueen(chess,i+1)){
                return true;   
            }
            chess[i][j] ='X';
        }
        return false;
    }


    public static void print(char arr[][]){
        System.out.println("-----------chess---------------");
        for(int i=0;i<arr.length;i++){

            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]);
            }

            System.out.println();
        }

    }

    public static void main(String args[]){

        int n=5;
        char chess[][]= new char[n][n];

        for(int i=0;i<n;i++){

            for(int j=0;j<n;j++){

                chess[i][j] ='X';
        }
        }
        if(nQueen(chess,0)){
            
        System.out.print("Solution is Possible");
        }else{
            
        System.out.print("Solution is not Possible");
        }

    }
}

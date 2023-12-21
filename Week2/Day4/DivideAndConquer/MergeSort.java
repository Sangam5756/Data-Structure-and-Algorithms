import java.util.*;

public class MergeSort{

    public static void mergeSort(int arr[], int si, int ei){
        // base conditon
        if(si >= ei){
            return;
        }       
        int mid = si+(ei-si)/2; // We using approach of divide and conquer so we have to find mid
        mergeSort(arr,si,mid);// we call the mergesort for left part which is si to mid
        mergeSort(arr,mid+1,ei);// we call the mergeSort for right part which mid+1 to ei;
        merge(arr,si,mid,ei);//so after the dividing left and right we merge the left and right part

    }

    public  static void merge(int arr[],int si,int mid,int ei){
        int temp[] = new int[ei-si+1]; //(0,3) = 4  (4,6)=3     (6-0)+1 =7
        int i =si; // left part iterator
        int j =mid+1;//right part iterator
        int k =0;   //iterator for the temp array;

        while(i<=mid && j<=ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                k++;
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
                k++;
            }
        }

        // remaining left part
        while( i <= mid){
            temp[k++] = arr[i++];
            // i++;
            // k++;
        }

        // remaining rigth part
        while(j <= ei){
        temp[k++] =arr[j++];
        // i++;
        // k++;
        }

        // Merge the both right and left part
        for(k=0, i =si ;k<temp.length;k++,i++){
            arr[i]=temp[k] ;
        }

    }

    
    public static void print(int arr[]){
        for(int i =0 ;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String args[]){

        int arr[] = {6,3,9,5,2,8};
        mergeSort(arr,0,arr.length-1);
        print(arr);

    }
}

import java.util.*;

public class SearchInSortedArray{
    
    public static int searchSortedArray(int arr[], int tar, int si, int ei){

        if(si >= ei){
            return -1;
        }
        // Find Mid
        int mid = si +(ei-si)/2;

        //  found at mid
        if(arr[mid] == tar){
            return mid;
        }
        // search in left side 
        if(arr[si] <= arr[mid]){
            if(arr[si]<=tar && tar <= arr[mid]){
                return searchSortedArray(arr,tar,si,mid);
            }
            else{
                return searchSortedArray(arr,tar,mid+1,ei);
            }
        }
        else{
            if(arr[mid] <=tar && tar <=arr[ei]){
                return searchSortedArray(arr,tar,mid+1,ei);
            }else{
                return searchSortedArray(arr,tar,si,mid-1);
            }
        }
    }

    public static void main(String args[]){
        int arr[] = {4,5,6,7,0,1,2};
        int idx = searchSortedArray(arr,0,0,arr.length-1);
        System.out.println(idx);
        
    }
}
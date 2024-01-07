public class FindFirstOccurenceOfElement{

    public static int firstOccurence(int arr[], int i,int key){

        if(i == arr.length ){
            return -1;
        }
        if(arr[i] == key ){
            return i;
        }
            return firstOccurence(arr,i+1,key);
            
        

    }

    public static void main(String args[]){
        int arr[] ={ 1,2,3,4,5,5,5,6};
        System.out.println(firstOccurence(arr,0,5));

    }
}
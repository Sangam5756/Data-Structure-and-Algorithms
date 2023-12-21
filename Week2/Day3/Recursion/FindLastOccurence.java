public class FindLastOccurence{

        public static int lastOccurence(int arr[], int i,int key){
            if(i == arr.length){
                return -1;
            }
            int found =lastOccurence(arr,i+1,key);
            
            if(found == -1  && arr[i] == key)
            {
                return i;
            }
            return found;
            

        }

    public static void main(String args[]){
        int arr[] ={ 1,2,3,4,5,5,5,6};
        System.out.println(lastOccurence(arr,0,5));

    }
}
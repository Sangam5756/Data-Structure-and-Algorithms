import java.util.*;

public class AreaofHistogram{

    public static int area(int arr[]){
        int maxArea = 0;
        int nsl[] =new int[arr.length];
        int nsr[] = new int[arr.length];
        Stack<Integer> s = new Stack<>();

        // Next smaller left element
        for(int i=0; i<arr.length; i++){

            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;
            } else {
                nsl[i] =s.peek();
            }
            s.push(i);
        }

        // next smaller right element
        s = new Stack<>();
        for(int i = arr.length-1; i >=0; i--){
            while(!s.isEmpty() && arr[s.peek()] >=  arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]= arr.length;
            }else{
                nsr[i] =s.peek();
            }
            s.push(i);
        }


        // Area calculation
        // ht = arr[i]
        // width = j -i +1
        // area= ht  * width
        // maxarea = max(maxarea,area);
        for(int i =0; i< arr.length; i++){
            int ht = arr[i];
            int width = nsr[i] - nsl[i]  - 1;
            int area = ht * width;
            maxArea =Math.max(area,maxArea);
        }

        return maxArea;
      
    }

    public static void main(String args[]){
        int arr[] = { 0,9};
        System.out.println(area(arr));

    }
}

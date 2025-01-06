import java.util.*;

class Demo {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        ArrayList<Integer> arr3 = new ArrayList<>();
        int i=0; //start at nums1
        int j=0; //start at nums2
            if (n1 == 0) {
                return n2 % 2 == 1 ? nums2[n2 / 2] : (nums2[n2 / 2] + nums2[n2 / 2 - 1]) / 2.0; 
                }
        if (n2 == 0) {
             return n1 % 2 == 1 ? nums1[n1 / 2] : (nums1[n1 / 2] + nums1[n1 / 2 - 1]) / 2.0;
                }
        // go throw the array and merge them
        while(i < n1 && j < n2){
            if(nums1[i] < nums2[j]){
                arr3.add(nums1[i]);
                i++;
            }else{
                arr3.add(nums2[j]);
                j++;
            }
        }
        // for remaining elements of nums1
        while(i < n1){
            arr3.add(nums1[i]);
            i++;
        }
        // for remaining elements of nums2
        while(j < n2){
            arr3.add(nums2[j]);
            j++;
        }
        int n = n1+n2;
        if( n %2 == 1){
            return arr3.get(n/2); 
        }
        else{
            return (double)((double)arr3.get(n/2)+arr3.get((n/2)-1))/2;
            
        }
    }

     public static double findMedianSortedArrays2(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        
        int i = 0; // start at nums1
        int j = 0; // start at nums2
        int idx2 = (n1 + n2 )/ 2;
        int idx1 = idx2 - 1;
        int idxel1 = -1;
        int idxel2 = -1;
        int count = 0;

            if (n1 == 0) {
                return n2 % 2 == 1 ? nums2[n2 / 2] : (nums2[n2 / 2] + nums2[n2 / 2 - 1]) / 2.0;
            }
            if (n2 == 0) {
                return n1 % 2 == 1 ? nums1[n1 / 2] : (nums1[n1 / 2] + nums1[n1 / 2 - 1]) / 2.0;
            }

        // go throw the array and merge them
        while (i < n1 && j < n2) {
            if (nums1[i] < nums2[j]) {
                if (count == idx1)
                    idxel1 = nums1[i];
                if (count == idx2)
                    idxel2 = nums1[i];
                count++;
                i++;
            } else {
                if (count == idx1)
                    idxel1 = nums2[j];
                if (count == idx2)
                    idxel2 = nums2[j];
                count++;
                j++;
            }
        }
        // for remaining elements of nums1
        while (i < n1) {
            if (count == idx1)
                idxel1 = nums1[i];
            if (count == idx2)
                idxel2 = nums1[i];
            i++;
            count++;
        }
        // for remaining elements of nums2
        while (j < n2) {
            if (count == idx1) idxel1 = nums2[j];
            if (count == idx2) idxel2 = nums2[j];
            j++;
            count++;
        }

        int n = n1 + n2;
        if (n % 2 == 1) {
            return (idxel2);
        } else {
            return (double) ((double)(idxel1 +idxel2)) / 2.0;

        }
    }

}

public class Program{

    public static void main(String[] args) {

        // Test case 1
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        double median1 = Demo.findMedianSortedArrays(nums1, nums2);
        double median_1 = Demo.findMedianSortedArrays2(nums1, nums2);
        System.out.println("Median of nums1 and nums2: " + median1);
        System.out.println("Median of nums1 and nums2: " + median_1);

        // Test case 2
        int[] nums1_2 = {1, 2};
        int[] nums2_2 = {3, 4};
        double median2 = Demo.findMedianSortedArrays(nums1_2, nums2_2);
        double median_2 = Demo.findMedianSortedArrays2(nums1_2, nums2_2);
        System.out.println("Median of nums1_2 and nums2_2: " + median2);
        System.out.println("Median of nums1_2 and nums2_2: " + median_2);

        // Test case 3
        int[] nums1_3 = {};
        int[] nums2_3 = {};
        double median3 = Demo.findMedianSortedArrays(nums1_3, nums2_3);
        double median_3 = Demo.findMedianSortedArrays2(nums1_3, nums2_3);
        System.out.println("Median of nums1_3 and nums2_3: " + median3);
        System.out.println("Median of nums1_3 and nums2_3: " + median_3);
    }


}
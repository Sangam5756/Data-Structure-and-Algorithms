class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;

        int n = n1 + n2;

        int mid1 = (n - 1) / 2;
        int mid2 = n / 2;

        int count = 0;
        int i = 0, j = 0;
        int num1 = 0, num2 = 0;

        while (count <= mid2) {
            int a = (i < n1) ? nums1[i] : Integer.MAX_VALUE;
            int b = (j < n2) ? nums2[j] : Integer.MAX_VALUE;

            if (a < b) {
                if (count == mid1) num1 = nums1[i];
                if (count == mid2) num2 = nums1[i];
                i++;
            } else {
                if (count == mid1) num1 = nums2[j];
                if (count == mid2) num2 = nums2[j];
                j++;
            }
            count++;
        }

        if (n % 2 == 1) {
            return num2;
        } else {
            return (num1 + num2) / 2.0;
        }
    }
}

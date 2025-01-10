public class Squarx {
    public int mySqrt(int x) {
        // Edge cases
        if (x == 0 || x == 1) {
            return x;
        }

        // Define the search range
        int left = 0;
        int right = x / 2;

        // Perform binary search
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long square = (long) mid * mid; // Avoid overflow

            if (square == x) {
                return mid; // Found the exact square root
            } else if (square < x) {
                left = mid + 1; // The square root must be larger
            } else {
                right = mid - 1; // The square root must be smaller
            }
        }

        // The `right` pointer gives the integer part of the square root
        return right;
    }

    public static void main(String[] args) {
        Squarx solution = new Squarx();

        // Test cases
        int test1 = 4;
        int test2 = 8;
        int test3 = 16;
        int test4 = 1;
        int test5 = 0;

        System.out.println("Square root of " + test1 + " is: " + solution.mySqrt(test1)); // Output: 2
        System.out.println("Square root of " + test2 + " is: " + solution.mySqrt(test2)); // Output: 2
        System.out.println("Square root of " + test3 + " is: " + solution.mySqrt(test3)); // Output: 4
        System.out.println("Square root of " + test4 + " is: " + solution.mySqrt(test4)); // Output: 1
        System.out.println("Square root of " + test5 + " is: " + solution.mySqrt(test5)); // Output: 0
    }
}

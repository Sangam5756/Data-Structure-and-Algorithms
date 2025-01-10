 69. (leetcode) Sqrt(x)

### Problem Understanding:
- We need to compute the integer square root of `x`, i.e., the greatest integer `y` such that `y * y <= x`.
- If `x` is a perfect square, the square root should return the exact value. If not, the square root should return the largest integer whose square is less than or equal to `x`.

### Approach:

We can use **binary search** to find the square root:

1. **Initial Conditions**:
   - If `x` is 0 or 1, we can directly return `x` because `sqrt(0) = 0` and `sqrt(1) = 1`.

2. **Binary Search Setup**:
   - We will use binary search to find the integer square root. The range for `y` (the square root) is between `0` and `x / 2` (because for `x > 1`, `sqrt(x)` is always less than `x / 2`).
   
3. **Binary Search**:
   - Start with two pointers: `left = 0` and `right = x / 2`.
   - While `left <= right`:
     - Calculate the middle point `mid = left + (right - left) / 2`.
     - Compute `mid * mid`:
       - If `mid * mid == x`, return `mid` (exact square root found).
       - If `mid * mid < x`, it means the square root is larger, so move `left = mid + 1`.
       - If `mid * mid > x`, it means the square root is smaller, so move `right = mid - 1`.

4. **Final Result**:
   - When the binary search ends, `right` will be the largest integer such that `right * right <= x`.

### Code Implementation:

```java
class Solution {
    public int mySqrt(int x) {
        // Special case: if x is 0 or 1, return x itself
        if (x == 0 || x == 1) {
            return x;
        }
        
        int left = 0, right = x / 2;
        
        // Perform binary search
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long square = (long) mid * mid;  // Use long to avoid overflow
            
            if (square == x) {
                return mid;  // Found the exact square root
            } else if (square < x) {
                left = mid + 1;  // The square root must be larger
            } else {
                right = mid - 1;  // The square root must be smaller
            }
        }
        
        // When the loop ends, `right` will be the largest integer where `right * right <= x`
        return right;
    }
}
```

### Explanation:

1. **Edge Case Handling**: 
   - If `x == 0` or `x == 1`, we return `x` immediately because `sqrt(0) = 0` and `sqrt(1) = 1`.
   
2. **Binary Search**:
   - We search between `left = 0` and `right = x / 2` (because the square root of any number greater than 1 is at most half of the number).
   - We calculate `mid` as the middle index and check if `mid * mid` equals `x`. If it does, we return `mid`.
   - If `mid * mid` is less than `x`, it means the square root is larger, so we adjust `left = mid + 1`.
   - If `mid * mid` is greater than `x`, it means the square root is smaller, so we adjust `right = mid - 1`.

3. **Final Answer**:
   - Once the loop exits, `right` will be the largest integer for which `right * right <= x`, so we return `right`.

### Time Complexity:
- **O(log x)**: The binary search cuts the search space in half with each iteration, so the time complexity is logarithmic relative to `x`.

### Example Walkthrough:

#### Example 1: `x = 8`
1. Initialize `left = 0` and `right = 4` (since `x / 2 = 8 / 2 = 4`).
2. First iteration:
   - `mid = 2`, and `2 * 2 = 4`, which is less than 8.
   - Update `left = mid + 1 = 3`.
3. Second iteration:
   - `mid = 3`, and `3 * 3 = 9`, which is greater than 8.
   - Update `right = mid - 1 = 2`.
4. The loop ends, and we return `right = 2` because `2 * 2 = 4` is the largest integer whose square is less than or equal to 8.

**Output: 2**

#### Example 2: `x = 16`
1. Initialize `left = 0` and `right = 8` (since `x / 2 = 16 / 2 = 8`).
2. First iteration:
   - `mid = 4`, and `4 * 4 = 16`, which equals `x`.
   - Return `4`.

**Output: 4**

---

This binary search solution efficiently calculates the integer square root with **O(log n)** time complexity.
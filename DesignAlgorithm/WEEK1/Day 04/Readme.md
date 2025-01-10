# Binary Search
278. First Bad Version
    - You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.
    You are given an API bool isBadVersion(version) which returns whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.

To solve this problem the optimal approach is to use **binary search**. This approach minimizes the number of API calls (i.e., `isBadVersion()` calls) and efficiently finds the first bad version in logarithmic time, i.e., **O(log n)** time complexity.

### Problem Breakdown:

- You are given `n` versions: [1, 2, ..., n], and you're tasked with finding the first bad version.
- The problem specifies that if a version `v` is bad, then all subsequent versions (`v+1, v+2, ..., n`) are also bad.
- The API `isBadVersion(version)` will return `true` if the given version is bad, and `false` if it's good.

### Plan:

1. **Binary Search Approach**:
   - Use binary search to divide the problem space into two halves.
   - At each step:
     - Check the middle version `mid`.
     - If `isBadVersion(mid)` returns `true`, this means that the first bad version is at `mid` or before `mid`. So, we move the `right` pointer to `mid`.
     - If `isBadVersion(mid)` returns `false`, this means that the first bad version is after `mid`. So, we move the `left` pointer to `mid + 1`.
   - Continue this process until `left` converges to the first bad version.

### Code Implementation:

```java
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1, right = n;

        while (left < right) {
            int mid = left + (right - left) / 2;  // To avoid overflow

            if (isBadVersion(mid)) {
                right = mid;  // If mid is bad, first bad version is at mid or before it
            } else {
                left = mid + 1;  // If mid is good, first bad version is after mid
            }
        }

        return left;  // When left == right, it will be the first bad version
    }
}
```

### Explanation:

1. **Binary Search**:
   - We initialize `left = 1` and `right = n`.
   - In the loop, we calculate the middle index `mid = left + (right - left) / 2` to avoid overflow.
   - If `isBadVersion(mid)` is `true`, this means the first bad version could be at `mid` or before `mid`. So, we set `right = mid`.
   - If `isBadVersion(mid)` is `false`, this means the first bad version must be after `mid`. So, we set `left = mid + 1`.
   - The loop continues until `left == right`, which will give us the first bad version.

2. **Termination**:
   - When `left` equals `right`, we've found the first bad version.

### Example Walkthrough:

#### Example 1:
**Input**: `n = 5`, `bad = 4`

- Call `isBadVersion(3)` → `false`, so `left = 4`.
- Call `isBadVersion(4)` → `true`, so `right = 4`.
- Now `left == right == 4`, so the answer is `4`.

#### Example 2:
**Input**: `n = 1`, `bad = 1`

- Call `isBadVersion(1)` → `true`, so `left == right == 1`.
- The answer is `1`.

### Time Complexity:
- **Time complexity**: **O(log n)** because we're halving the search space in each iteration of the binary search.
- **Space complexity**: **O(1)** as we're only using a few variables (`left`, `right`, and `mid`).


### Algorithm for Binary Search (Iterative Approach)

1. **Input**: A sorted array \( A \) of size \( n \), and a target value \( x \).
2. **Output**: Index of \( x \) in \( A \), or -1 if \( x \) is not in \( A \).

---

1. **Initialize**:
   - Set \( low = 0 \).
   - Set \( high = n - 1 \).

2. **While Loop**:
   - Repeat while \( low \leq high \):
     1. Compute \( mid = \lfloor (low + high) / 2 \rfloor \).
     2. **Check**:
        - If \( A[mid] == x \), return \( mid \) (element found).
        - If \( A[mid] < x \), set \( low = mid + 1 \).
        - If \( A[mid] > x \), set \( high = mid - 1 \).

3. **End Loop**:
   - If the loop ends and \( x \) is not found, return -1.

---

### Pseudocode:
```plaintext
BinarySearch(A, n, x):
    low = 0
    high = n - 1
    while low ≤ high:
        mid = (low + high) // 2
        if A[mid] == x:
            return mid
        else if A[mid] < x:
            low = mid + 1
        else:
            high = mid - 1
    return -1
```

---

### Time Complexity:
- **Best case**: \( O(1) \) (when \( x \) is found at the first guess).
- **Worst case**: \( O(\log n) \).

### Space Complexity:
- **Iterative**: \( O(1) \).
- **Recursive**: \( O(\log n) \) due to recursion stack.




# Problem Breakdown: (LEETCODE-35)
- If the **target** is found in the array, return its index.
- If the **target** is not found, return the index where it should be inserted to maintain the sorted order.

### Approach:
1. Use two pointers, `left` and `right`, to represent the current search range.
2. Calculate the middle index `mid` in each iteration and compare `nums[mid]` with the target:
   - If `nums[mid] == target`, return `mid`.
   - If `nums[mid] < target`, the target must be to the right, so update `left = mid + 1`.
   - If `nums[mid] > target`, the target must be to the left, so update `right = mid - 1`.
3. If the loop exits (i.e., `left > right`), it means the target is not in the array. The correct insertion index is `left`, because all elements before `left` are smaller than the target, and all elements after `left` are larger.

### Code Implementation:

```java
class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        
        return left;  // If target is not found, return the insertion index
    }
}
```





### Variables:
rt.

### Binary Search Steps:


---


### Explanation:

1. **Initialization**: 
- **`left`**: Start index of the search range.
- **`right`**: End index of the search range.
- **`mid`**: Middle index, calculated as the average of `left` and `right`.
- **`target`**: The value we are searching for or the value we want to insert

2. **Binary Search Loop**:
    1. The algorithm starts with the left pointer at index 0 and the right pointer at the last index of the array (`nums.length - 1`).
    2. It computes the middle index `mid` and compares `nums[mid]` with the `target`.
    3. If `nums[mid] == target`, it returns the index `mid`, because we found the target.
    4. If `nums[mid] > target`, the target must be to the left of `mid`, so we adjust the `right` pointer to `mid - 1`.
    5. If `nums[mid] < target`, the target must be to the right of `mid`, so we adjust the `left` pointer to `mid + 1`.
    6. The loop continues until `left > right`. At this point, if the target hasn't been found, the `left` pointer will be at the correct   insertion point for the target.

3. **Exit Condition**:
   - If the target is not found, the loop exits, and the correct insertion index is `left`.

### Time Complexity:
- **O(log n)** because the algorithm cuts the search space in half with each iteration (binary search).

### Example Walkthrough:

Let's go through the examples mentioned:

---

### Example 1: `nums = [1, 3, 5, 6]`, `target = 5`

#### Initialization:
- `left = 0`
- `right = 3`

#### First Iteration:
- `mid = 1 + (3 - 1) / 2 = 1` (so `mid = 1`)
- `nums[1] = 3`, which is less than `5`, so we move `left = mid + 1 = 2`.

#### Second Iteration:
- `left = 2`, `right = 3`
- `mid = 2 + (3 - 2) / 2 = 2` (so `mid = 2`)
- `nums[2] = 5`, which is equal to `target`, so we return `mid = 2`.

**Output: 2**

### Explanation of Each Iteration:

Let's walk through an example with the following array `nums = [1, 3, 5, 6]` and a target value `target = 5`.

#### Initialization:
- `left = 0`
- `right = 3` (since there are 4 elements, the last index is 3)
- `nums = [1, 3, 5, 6]`

#### First Iteration:
- Calculate the middle index:  
  `mid = left + (right - left) / 2 = 0 + (3 - 0) / 2 = 1`
  
- Check if `nums[mid] == target`:  
  `nums[1] = 3`, which is not equal to `target = 5`.  
  So, we move to the next condition.

- Check if `nums[mid] < target`:  
  `nums[1] = 3` and `target = 5`.  
  Since `3 < 5`, the target must be to the right of `mid`. We update the `left` pointer:
  - `left = mid + 1 = 1 + 1 = 2`

#### Second Iteration:
- Now `left = 2`, `right = 3`.
  
- Calculate the middle index:  
  `mid = left + (right - left) / 2 = 2 + (3 - 2) / 2 = 2`
  
- Check if `nums[mid] == target`:  
  `nums[2] = 5`, which **is equal to** `target = 5`.  
  So, we return `mid = 2`.

### Final Result:
The target value `5` is found at index `2`, and the method returns `2`.

---

### In the case where the target is **not present** in the array, the `while` loop will break, and `left` will point to the correct insertion index.

#### Example with target `target = 7`:

If we change the target to `7`, here's how the iterations would go:

#### Initialization:
- `left = 0`
- `right = 3`

#### First Iteration:
- `mid = 1`
- `nums[1] = 3`, which is less than `7`, so we move the `left` pointer:
  - `left = 2`

#### Second Iteration:
- `mid = 2`
- `nums[2] = 5`, which is less than `7`, so we move the `left` pointer:
  - `left = 3`

#### Third Iteration:
- `mid = 3`
- `nums[3] = 6`, which is less than `7`, so we move the `left` pointer:
  - `left = 4`

Now, `left = 4` and `right = 3`. Since `left > right`, the loop terminates, and we return `left = 4`, which is the correct position to insert `7` to maintain the sorted order.




---

### Example 2: `nums = [1, 3, 5, 6]`, `target = 2`

#### Initialization:
- `left = 0`
- `right = 3`

#### First Iteration:
- `mid = 1 + (3 - 1) / 2 = 1` (so `mid = 1`)
- `nums[1] = 3`, which is greater than `2`, so we move `right = mid - 1 = 0`.

#### Second Iteration:
- `left = 0`, `right = 0`
- `mid = 0 + (0 - 0) / 2 = 0` (so `mid = 0`)
- `nums[0] = 1`, which is less than `2`, so we move `left = mid + 1 = 1`.

Since `left = 1` and `right = 0`, the loop exits. The correct insertion position is `left = 1`.

**Output: 1**

---

### Example 3: `nums = [1, 3, 5, 6]`, `target = 7`

#### Initialization:
- `left = 0`
- `right = 3`

#### First Iteration:
- `mid = 1 + (3 - 1) / 2 = 1` (so `mid = 1`)
- `nums[1] = 3`, which is less than `7`, so we move `left = mid + 1 = 2`.

#### Second Iteration:
- `left = 2`, `right = 3`
- `mid = 2 + (3 - 2) / 2 = 2` (so `mid = 2`)
- `nums[2] = 5`, which is less than `7`, so we move `left = mid + 1 = 3`.

#### Third Iteration:
- `left = 3`, `right = 3`
- `mid = 3 + (3 - 3) / 2 = 3` (so `mid = 3`)
- `nums[3] = 6`, which is less than `7`, so we move `left = mid + 1 = 4`.

Since `left = 4` and `right = 3`, the loop exits. The correct insertion position is `left = 4`.

**Output: 4**

### Conclusion:
- If the target is found, the index of the target is returned.
- If the target is not found, the `left` pointer indicates the index where the target should be inserted.
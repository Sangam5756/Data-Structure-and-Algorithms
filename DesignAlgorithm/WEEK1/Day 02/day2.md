Sure! Here's the pseudocode for the algorithm you've implemented to find the median of two sorted arrays by merging them:

# BruetForce Approach Pseudocode

```plaintext
function findMedianSortedArrays(nums1, nums2):
    n1 = length of nums1
    n2 = length of nums2
    arr3 = new empty array list
    
    i = 0  // index for nums1
    j = 0  // index for nums2

    // Merge both sorted arrays into arr3
    while i < n1 AND j < n2:
        if nums1[i] < nums2[j]:
            arr3.add(nums1[i])
            i = i + 1
        else:
            arr3.add(nums2[j])
            j = j + 1
    
    // Add remaining elements of nums1 if any
    while i < n1:
        arr3.add(nums1[i])
        i = i + 1
    
    // Add remaining elements of nums2 if any
    while j < n2:
        arr3.add(nums2[j])
        j = j + 1

    // Calculate the median from arr3
    n = length of arr3
    
    if n is odd:
        return arr3[n / 2]  // Middle element
    else:
        return (arr3[n / 2] + arr3[(n / 2) - 1]) / 2.0  // Average of two middle elements

```

### **Explanation of the Pseudocode:**

1. **Initialization**:
   - We calculate the lengths `n1` and `n2` of the two input arrays `nums1` and `nums2`.
   - We create an empty array list `arr3` to store the merged elements from `nums1` and `nums2`.
   - We initialize two indices `i` and `j` to 0, which will be used to traverse `nums1` and `nums2` respectively.

2. **Merging Step**:
   - We use a `while` loop to traverse both arrays (`nums1` and `nums2`) as long as there are still elements in both arrays. 
   - At each step, we compare the elements at indices `i` (in `nums1`) and `j` (in `nums2`). 
     - If the element in `nums1` is smaller, we add it to `arr3` and increment `i`.
     - If the element in `nums2` is smaller or equal, we add it to `arr3` and increment `j`.

3. **Remaining Elements**:
   - Once the merging loop ends (when one of the arrays is fully traversed), we may still have remaining elements in either `nums1` or `nums2`. We add any remaining elements from both arrays to `arr3` using additional `while` loops.

4. **Median Calculation**:
   - We calculate the total length of the merged array `arr3` as `n`.
   - If `n` is odd, the median is the element at the middle index `n / 2` of the merged array.
   - If `n` is even, the median is the average of the two middle elements, which are located at indices `n / 2` and `(n / 2) - 1`.

### **Time Complexity**:
- Merging the arrays takes `O(n1 + n2)` time where `n1` and `n2` are the lengths of `nums1` and `nums2`, respectively.
- Finding the median after merging is done in constant time `O(1)`.
- So, the overall time complexity is `O(n1 + n2)`.



# BruetForce Approach Pseudocode Without Using the Extra Space
### **Algorithm with Pseudocode for Finding the Median of Two Sorted Arrays**

#### **Problem Overview:**

We are given two sorted arrays, `nums1` and `nums2`. The goal is to find the median of these two sorted arrays **without merging them completely**. We need to traverse the arrays in a way that we can compute the median in an efficient manner.

The median is:
- If the total number of elements is odd, the median is the middle element.
- If the total number of elements is even, the median is the average of the two middle elements.

#### **Approach:**
To solve this problem efficiently:
1. We can merge the arrays step by step, but instead of storing the entire merged array, we just keep track of the two middle elements.
2. Use two pointers (`i` and `j`) to traverse both arrays (`nums1` and `nums2`).
3. Compare the elements of the two arrays and increment the pointer of the array with the smaller element, all the while keeping track of the elements corresponding to the median indices.
4. Once we have merged enough elements (reached the median position), we return the median.

### **Step-by-Step Algorithm:**

1. **Initialize pointers**:
   - Initialize `i` and `j` as pointers to the start of `nums1` and `nums2`, respectively.
   - Calculate the middle positions `idx1` and `idx2` where the median elements will be located in the merged sequence.

2. **Merge step**:
   - Traverse both arrays using the two pointers (`i` and `j`).
   - Compare the elements at `nums1[i]` and `nums2[j]` and select the smaller element to increment the count.
   - If the current count matches `idx1` or `idx2`, store the corresponding element in `idxel1` or `idxel2`.

3. **Handle remaining elements**:
   - After one array is fully processed, continue processing the remaining elements from the other array.

4. **Calculate and return the median**:
   - If the total number of elements is odd, return `idxel2` (the element at the middle position).
   - If the total number of elements is even, return the average of `idxel1` and `idxel2`.

### **Pseudocode:**

```plaintext
function findMedianSortedArrays(nums1, nums2):
    n1 = length of nums1
    n2 = length of nums2
    
    // Calculate the indices of the two middle elements
    idx2 = (n1 + n2) / 2        // Middle index
    idx1 = idx2 - 1              // Second middle index for even-length arrays
    
    i = 0  // Pointer for nums1
    j = 0  // Pointer for nums2
    count = 0  // To track the current index in the merged array
    idxel1 = -1  // To store element at idx1
    idxel2 = -1  // To store element at idx2
    
    // Merge arrays until we have reached the middle elements
    while i < n1 and j < n2:
        if nums1[i] < nums2[j]:
            if count == idx1:
                idxel1 = nums1[i]
            if count == idx2:
                idxel2 = nums1[i]
            i += 1
        else:
            if count == idx1:
                idxel1 = nums2[j]
            if count == idx2:
                idxel2 = nums2[j]
            j += 1
        count += 1

    // Process any remaining elements in nums1
    while i < n1:
        if count == idx1:
            idxel1 = nums1[i]
        if count == idx2:
            idxel2 = nums1[i]
        i += 1
        count += 1

    // Process any remaining elements in nums2
    while j < n2:
        if count == idx1:
            idxel1 = nums2[j]
        if count == idx2:
            idxel2 = nums2[j]
        j += 1
        count += 1

    // Calculate the median
    if (n1 + n2) % 2 == 1:
        return idxel2   // Odd total elements, median is the middle element
    else:
        return (idxel1 + idxel2) / 2.0   // Even total elements, median is the average of the two middle elements
```

### **Explanation of Pseudocode:**

1. **Initialization**:
   - We first determine the lengths of the two arrays `nums1` and `nums2`.
   - We then calculate the positions `idx1` and `idx2` where the middle elements of the merged array will be located.

2. **Merging Arrays**:
   - We use two pointers (`i` and `j`) to traverse through `nums1` and `nums2`.
   - At each step, we compare the elements `nums1[i]` and `nums2[j]`. The smaller of the two is added to the merged array by incrementing the pointer for that array.
   - If `count` matches `idx1` or `idx2` (which are the positions of the middle elements), we store those elements in `idxel1` and `idxel2`.

3. **Handling Remaining Elements**:
   - If one of the arrays is exhausted, we continue traversing the other array and check if we have reached the median positions (`idx1` or `idx2`).

4. **Median Calculation**:
   - Once we have the two middle elements (`idxel1` and `idxel2`), we compute the median:
     - If the total length is odd, return the element at `idx2`.
     - If the total length is even, return the average of the elements at `idx1` and `idx2`.

### **Time Complexity:**

- The algorithm iterates through both arrays only once (using the two pointers). Therefore, the time complexity is **O(n1 + n2)**, where `n1` and `n2` are the lengths of `nums1` and `nums2` respectively.
  
- The space complexity is **O(1)** because we only store a few variables (`idx1`, `idx2`, `count`, `idxel1`, and `idxel2`) and do not require additional data structures like a merged array.

### **Space Complexity:**

- Since the algorithm only uses a fixed amount of space (no additional arrays are created), the space complexity is **O(1)**.

---

### **Example Walkthrough:**

Consider the following example:

```plaintext
nums1 = [1, 3]
nums2 = [2]
```

**Step-by-Step Walkthrough**:

1. **Initialization**:
   - `n1 = 2`, `n2 = 1`
   - `idx2 = (2 + 1) / 2 = 1`, `idx1 = 0`
   - `i = 0`, `j = 0`, `count = 0`, `idxel1 = -1`, `idxel2 = -1`

2. **Merge Step**:
   - Compare `nums1[0] = 1` with `nums2[0] = 2`.
   - Since `1 < 2`, increment `i` and set `idxel1 = 1` when `count == idx1`.
   - `count = 1`, now compare `nums1[1] = 3` with `nums2[0] = 2`.
   - Since `2 < 3`, increment `j` and set `idxel2 = 2` when `count == idx2`.
   
3. **Remaining Elements**:
   - After processing `nums2`, `i = 1`, `j = 1`, and the merging is complete.

4. **Median Calculation**:
   - Since the total number of elements is **odd** (`n1 + n2 = 3`), the median is the element at `idx2 = 2`.

Thus, the output is `2.0`.

---

This algorithm ensures that we can compute the median efficiently without fully merging the arrays, making it suitable for large input sizes.


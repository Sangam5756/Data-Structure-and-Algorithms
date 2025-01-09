

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

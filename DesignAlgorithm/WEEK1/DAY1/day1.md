PROBLEM STATEMENT:

Write a program to swap given two integer values.

Algorithm:
    ==> read two parameters from the user.
    ==> implement business logic related to swaping
        Logic1
        Logic2
        Logic3
        Logic4
        Logic5

    ==> print the data before swaping and after swaping
Sure! Let's go step-by-step through each method using **numerical examples** to explain how the swapping happens.

### Let's assume we have:
- `a = 5`
- `b = 10`

We want to swap these two values using the different methods.

---

### 1. **Swap1: Using a Temporary Variable**
```java
static void Swap1(int a, int b) {
    int temp = a; // Store value of a in temp
    a = b;         // Assign value of b to a
    b = temp;      // Assign value of temp (original a) to b
    System.out.println("After Swapping a = " + a + " and b = " + b);
}
```

#### Step-by-Step Explanation:
1. **Store `a` in a temporary place**: 
   We use a `temp` variable to hold the value of `a`. This is important because once we change `a`, we lose its original value.
   
2. **Change `a` to `b`**: 
   Now, we assign `b` to `a`. So, `a` will now have the value of `b`.

3. **Assign `temp` (old `a`) to `b`**: 
   Finally, we use `temp` (which still holds the original value of `a`) and assign it to `b`.


#### Step-by-Step with Example:
1. **Initial values**: `a = 5`, `b = 10`
2. **Step 1**: `temp = a` → `temp = 5`
3. **Step 2**: `a = b` → `a = 10`
4. **Step 3**: `b = temp` → `b = 5`

**Result after swap**:
```
a = 10, b = 5
```

---

### 2. **Swap2: Using Addition and Subtraction**
```java
static void Swap2(int a, int b) {
    a = a + b; // Step 1: a = a + b
    b = a - b; // Step 2: b = a - b (which is original a)
    a = a - b; // Step 3: a = a - b (which is original b)
    System.out.println("After Swapping a = " + a + " and b = " + b);
}
```
#### Step-by-Step Explanation:
1. **Add `a` and `b`**: 
   We add `a` and `b` together and store the result in `a`.

2. **Find the original value of `a`**: 
   Now, we subtract `b` from `a` (which is now `a + b`). This gives us the original value of `a`, and we assign it to `b`.

3. **Find the original value of `b`**: 
   Finally, we subtract the new value of `b` (which is now the original `a`) from the current value of `a` (which is `a + b`). This gives us the original value of `b`.


#### Step-by-Step with Example:
1. **Initial values**: `a = 5`, `b = 10`
2. **Step 1**: `a = a + b` → `a = 5 + 10 = 15`
3. **Step 2**: `b = a - b` → `b = 15 - 10 = 5` (original `a`)
4. **Step 3**: `a = a - b` → `a = 15 - 5 = 10` (original `b`)

**Result after swap**:
```
a = 10, b = 5
```

---

### 3. **Swap3: Using Multiplication and Division**
```java
static void Swap3(int a, int b) {
    a = a * b; // Step 1: a = a * b
    b = a / b; // Step 2: b = a / b (which is original a)
    a = a / b; // Step 3: a = a / b (which is original b)
    System.out.println("After Swapping a = " + a + " and b = " + b);

}
```

#### Step-by-Step Explanation:
1. **Multiply `a` and `b`**: 
   Multiply the values of `a` and `b` and store the result in `a`. This is now a combination of both numbers.

2. **Find the original value of `a`**: 
   To get the original value of `a`, divide the new value of `a` (which is `a * b`) by `b`. The result is the original value of `a`, and we assign it to `b`.

3. **Find the original value of `b`**: 
   Finally, to get the original value of `b`, divide the new value of `a` (which is `a * b`) by `b` (which is now the original `a`). This gives us the original value of `b`.


#### Step-by-Step with Example:
1. **Initial values**: `a = 5`, `b = 10`
2. **Step 1**: `a = a * b` → `a = 5 * 10 = 50`
3. **Step 2**: `b = a / b` → `b = 50 / 10 = 5` (original `a`)
4. **Step 3**: `a = a / b` → `a = 50 / 5 = 10` (original `b`)

**Result after swap**:
```
a = 10, b = 5
```

---

### 4. **Swap4: Using XOR (Bitwise Operation)**
```java
static void Swap4(int a, int b) {
    a = a ^ b; // Step 1: a = a ^ b (XOR a and b)
    b = a ^ b; // Step 2: b = a ^ b (which gives the original a)
    a = a ^ b; // Step 3: a = a ^ b (which gives the original b)
    System.out.println("After Swapping a = " + a + " and b = " + b);
}
```

#### Step-by-Step Explanation:
1. **XOR `a` and `b`**: 
   XOR is a bitwise operation. It combines the bits of `a` and `b` and stores the result in `a`.

2. **Find the original value of `a`**: 
   XOR the new value of `a` (from step 1) with `b`. This gives us the original value of `a`, which we store in `b`.

3. **Find the original value of `b`**: 
   XOR the new value of `a` with the new value of `b` (which now holds the original `a`). This gives us the original value of `b`, which we store in `a`.

#### Step-by-Step with Example:
1. **Initial values**: `a = 5`, `b = 10`
2. **Step 1**: `a = a ^ b` → `a = 5 ^ 10 = 15` (XOR of `a` and `b`)
3. **Step 2**: `b = a ^ b` → `b = 15 ^ 10 = 5` (original `a`)
4. **Step 3**: `a = a ^ b` → `a = 15 ^ 5 = 10` (original `b`)

**Result after swap**:
```
a = 10, b = 5
```

---

### 5. **Swap5: Using a Single Expression**
```java
static void Swap5(int a, int b) {
    a = (a + b) - (b = a); // Step 1: a = (a + b) - (b = a)
    System.out.println("After Swapping a = " + a + " and b = " + b);
}
```

#### Step-by-Step Explanation:
1. **Combine `a` and `b` in a single step**: 
   First, we add `a` and `b` together. Then, we assign the new value of `a` to `b`. But notice that the `b = a` part happens first, before subtraction.

2. **Subtraction to finish the swap**: 
   After this, we subtract the new value of `b` from the new combined value of `a`, which gives us the original value of `b`, and we assign it to `a`.

#### Step-by-Step with Example:
1. **Initial values**: `a = 5`, `b = 10`
2. **Step 1**: `(a + b) = 5 + 10 = 15`. Then, `b = a` → `b = 5`. So now, `a = 15 - 5 = 10` (original `b`), and `b = 5` (original `a`).

**Result after swap**:
```
a = 10, b = 5
```

---

### Summary of Results:

- **Swap1**: `a = 10`, `b = 5`
- **Swap2**: `a = 10`, `b = 5`
- **Swap3**: `a = 10`, `b = 5`
- **Swap4**: `a = 10`, `b = 5`
- **Swap5**: `a = 10`, `b = 5`



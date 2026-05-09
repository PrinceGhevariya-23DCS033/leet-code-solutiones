# Intuition
# Array Rotation using Reversal Algorithm

## Right Rotate by `k`

Steps:
1. Reverse `0` to `n-k-1`
2. Reverse `n-k` to `n-1`
3. Reverse whole array

Example:
```text
1 2 3 4 5 6 7
k = 3

Reverse first part  -> 4 3 2 1 5 6 7
Reverse second part -> 4 3 2 1 7 6 5
Reverse whole       -> 5 6 7 1 2 3 4
```

Code:
```java
reverse(0, n-k-1);
reverse(n-k, n-1);
reverse(0, n-1);
```

---

## Left Rotate by `k`

Steps:
1. Reverse `0` to `k-1`
2. Reverse `k` to `n-1`
3. Reverse whole array

Example:
```text
1 2 3 4 5 6 7
k = 3

Reverse first part  -> 3 2 1 4 5 6 7
Reverse second part -> 3 2 1 7 6 5 4
Reverse whole       -> 4 5 6 7 1 2 3
```

Code:
```java
reverse(0, k-1);
reverse(k, n-1);
reverse(0, n-1);
```

## Time Complexity
- `O(n)`

## Space Complexity
- `O(1)`

# Key Learning

# Mistakes

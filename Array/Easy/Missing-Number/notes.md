# Intuition
# Missing Number - Sum Formula Approach

## Idea
Array contains numbers from `0` to `n` with one number missing.  

Find:
1. Expected sum using formula
2. Actual sum of array
3. Missing number = Expected Sum - Actual Sum

---

## Formula

Use sum of first `n` natural numbers:

:contentReference[oaicite:0]{index=0}

---

## Algorithm

1. Calculate expected sum:
```java
n * (n + 1) / 2
```

2. Traverse array and calculate actual sum

3. Return:
```java
expectedSum - actualSum
```

---

## Example

```text
nums = [3,0,1]
n = 3
```

Expected Sum:
```text
3 * (3 + 1) / 2 = 6
```

Actual Sum:
```text
3 + 0 + 1 = 4
```

Missing Number:
```text
6 - 4 = 2
```

---

## Code

```java
class Solution {
    public int missingNumber(int[] nums) {

        int n = nums.length;

        int sum_actual = (n * (n + 1)) / 2;
        int sum = 0;

        for(int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }

        return sum_actual - sum;
    }
}
```

---

## Time Complexity
- `O(n)`

## Space Complexity
- `O(1)`

---

## Key Point
- Expected sum includes all numbers from `0` to `n`
- Array sum misses one value
- Difference gives missing number

# Key Learning

# Mistakes

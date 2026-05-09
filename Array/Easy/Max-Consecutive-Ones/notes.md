# Intuition
# Maximum Consecutive Ones

## Idea
Find the longest continuous sequence of `1`s in the array.

- `k` stores starting index of current sequence of `1`
- If `0` comes, reset `k`
- Update maximum length continuously

---

## Algorithm

1. Traverse array
2. If element is `1`
   - if new sequence starts → store index in `k`
   - calculate current length
   - update maximum
3. If element is `0`
   - reset `k = -1`

---

## Example

```text
nums = [1,1,0,1,1,1]
```

### Step-by-Step

```text
1 1 -> length = 2
0   -> reset

1 1 1 -> length = 3
```

Maximum Consecutive Ones:
```text
3
```

---

## Code

```java
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int k = -1;
        int max = 0;

        for(int i = 0; i < nums.length; i++) {

            if(nums[i] == 1) {

                if(k == -1) {
                    k = i;
                }

                max = Math.max(max, i - k + 1);

            } else {
                k = -1;
            }
        }

        return max;
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
- `k` → starting index of current consecutive `1`s
- Reset when `0` appears
- Keep updating maximum length

# Key Learning

# Mistakes

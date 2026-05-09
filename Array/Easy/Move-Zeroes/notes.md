# Intuition
# Move Zeroes - Two Pointer Approach

## Idea
Move all non-zero elements to the front while keeping their order same.  
All zeroes automatically shift to the end.

---

## Algorithm

- `k` stores the position where next non-zero element should be placed.
- Traverse array using `i`
- If `nums[i] != 0`
  - swap `nums[i]` with `nums[k]`
  - increment `k`

---

## Example

```text
nums = [0,1,0,3,12]
```

### Step-by-Step

```text
i=1 -> swap(1,0)
1 0 0 3 12

i=3 -> swap(3,0)
1 3 0 0 12

i=4 -> swap(12,0)
1 3 12 0 0
```

Final Array:
```text
[1,3,12,0,0]
```

---

## Code

```java
class Solution {
    public void moveZeroes(int[] nums) {

        int k = 0;

        for(int i = 0; i < nums.length; i++) {

            if(nums[i] != 0) {

                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;

                k++;
            }
        }
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
- `i` → traverses array
- `k` → stores next position for non-zero element
- Maintains relative order of non-zero elements

# Key Learning

# Mistakes

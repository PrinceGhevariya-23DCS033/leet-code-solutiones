# Intuition
# Single Number - XOR Approach

## Idea
Every element appears twice except one element.  

Using XOR (`^`):
- Same numbers cancel each other
- Remaining number is the single element

---

## XOR Properties

```text
a ^ a = 0
a ^ 0 = a
```

So duplicate numbers become `0`.

---

## Algorithm

1. Initialize `single = 0`
2. Traverse array
3. XOR every element with `single`
4. Final value will be the unique element

---

## Example

```text
nums = [4,1,2,1,2]
```

### Step-by-Step

```text
0 ^ 4 = 4
4 ^ 1 = 5
5 ^ 2 = 7
7 ^ 1 = 6
6 ^ 2 = 4
```

Final Answer:
```text
4
```

---

## Code

```java
class Solution {
    public int singleNumber(int[] nums) {

        int single = 0;

        for(int i = 0; i < nums.length; i++) {
            single = single ^ nums[i];
        }

        return single;
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
- Duplicate elements cancel using XOR
- Only unique element remains
- No extra space needed

# Key Learning

# Mistakes

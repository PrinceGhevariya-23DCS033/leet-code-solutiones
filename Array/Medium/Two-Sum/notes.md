# Intuition
# Two Sum - HashMap Approach

## Idea
Find two numbers whose sum equals `target`.

Use HashMap to store:
```text
number -> index
```

For every element:
- Find remaining value needed
- Check if it already exists in map

---

## Important Formula

Needed Number:

:contentReference[oaicite:0]{index=0}

### Why `target - nums[i]` ?

```text
nums[i] + rem = target
```

So,

```text
rem = target - nums[i]
```

---

## Algorithm

1. Traverse array
2. Find remaining value:
```java
rem = target - nums[i]
```

3. Check if `rem` exists in map
   - if yes → answer found
4. Otherwise store current number and index

---

## Example

```text
nums = [2,7,11,15]
target = 9
```

### Step-by-Step

```text
i=0 -> nums[i]=2
rem = 9-2 = 7
store 2

i=1 -> nums[i]=7
rem = 9-7 = 2
2 exists in map
Answer = [0,1]
```

---

## Code

```java
class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {

            int rem = target - nums[i];

            if(map.containsKey(rem)) {
                return new int[]{map.get(rem), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{-1, -1};
    }
}
```

---

## Time Complexity
- `O(n)`

## Space Complexity
- `O(n)`

---

## Key Point
- Store visited numbers in HashMap
- Use:
```text
target - nums[i]
```

Because:
```text
nums[i] + rem = target
```
# Key Learning

# Mistakes

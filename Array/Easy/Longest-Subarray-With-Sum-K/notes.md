# Intuition
# Longest Subarray with Sum K - Prefix Sum + HashMap

## Idea
Use Prefix Sum and HashMap to find longest subarray having sum = `k`.

- Store prefix sum and its first index in map
- If `(sum - k)` exists earlier,
  then subarray between them has sum `k`

---

## Important Formula

Current Prefix Sum:

```text
sum
```

Needed Previous Prefix Sum:

:contentReference[oaicite:0]{index=0}

### Why `sum - k` and NOT `k - sum` ?

```text
currentSum - previousSum = k
```

So,

```text
previousSum = currentSum - k
```

Therefore:

```text
remaining = sum - k
```

---

## Algorithm

1. Traverse array
2. Keep calculating prefix sum
3. If `sum == k`
   - subarray starts from index `0`
4. Check if `(sum - k)` exists in map
   - calculate length
   - update maximum length
5. Store prefix sum only first time

---

## Example

```text
arr = [10,5,2,7,1,9]
k = 15
```

### Step-by-Step

```text
i=0 -> sum=10
store 10

i=1 -> sum=15
sum == k
maxLen = 2

i=3 -> sum=24
sum-k = 24-15 = 9
9 exists earlier
subarray length found
```

Final Answer:
```text
4
```

---

## Code

```java
class Solution {
    public int longestSubarray(int[] arr, int k) {

        Map<Integer,Integer> map = new HashMap<>();

        int sum = 0;
        int maxlen = 0;

        for(int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];

            if(sum == k) {
                maxlen = i + 1;
            } else {

                int remaining = sum - k;

                if(map.containsKey(remaining)) {

                    int len = i - map.get(remaining);

                    maxlen = Math.max(maxlen, len);
                }
            }

            if(!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        return maxlen;
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
- Store prefix sums in HashMap
- Use:
```text
sum - k
```
NOT:
```text
k - sum
```

Because:
```text
currentSum - previousSum = k
```

# Key Learning

# Mistakes

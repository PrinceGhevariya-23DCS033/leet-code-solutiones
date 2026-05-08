# Intuition

First take k = 1 because the first element is always unique. If the array size is 1, return 1 directly. Start traversing from index 1 and compare the current element with the previous element (nums[i] != nums[i-1]). If both are different, it means a new unique element is found, so place it at index k (nums[k] = nums[i]) and increment k. In this way, all unique elements are shifted to the front of the array. Finally return k, which represents the number of unique elements.

# Key Learning

# Mistakes

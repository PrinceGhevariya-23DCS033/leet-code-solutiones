# Intuition
First take a count variable to count break points. Traverse the array and check if the current element is greater than the next element (nums[i] > nums[i+1]). If true, increase count because sorted order breaks there. After the loop, also compare the last element with the first element (nums[n-1] > nums[0]) since the array is rotated and works circularly. If break points are more than 1, return false; otherwise return true because a sorted rotated array can have only one break point.

# Key Learning

# Mistakes

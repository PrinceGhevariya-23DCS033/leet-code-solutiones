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

            } 
            else {
                k = -1; 
            }
        }

        return max;
    }
}
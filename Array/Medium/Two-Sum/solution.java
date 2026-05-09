class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> map=new HashMap<>();
        int sum=0;

        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];

            int rem=target-nums[i];

            if(map.containsKey(rem)){
               return new int[]{map.get(rem),i};

            }

            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
        
    }
}
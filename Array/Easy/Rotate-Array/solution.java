class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int d=k%n;
        reverse(0,n-d-1,nums);
        reverse(n-d,nums.length-1,nums);
        reverse(0,nums.length-1,nums);
        
    }


    static void reverse(int start,int end,int nums[]){

        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }

    }
}
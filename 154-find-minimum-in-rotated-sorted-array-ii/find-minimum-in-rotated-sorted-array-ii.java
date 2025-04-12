class Solution {
    public int findMin(int[] nums) {
        int p=0,q=nums.length-1;
        while(p<q){
            if(nums[p]>=nums[q])
                p++;
                else
                return nums[p];
        }
        return nums[p];
    }
}
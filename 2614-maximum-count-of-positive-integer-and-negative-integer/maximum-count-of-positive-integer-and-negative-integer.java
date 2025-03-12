class Solution {
    public int maximumCount(int[] nums) {
        int negativeCount=0;
        int positiveCount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                positiveCount++;
            }
            else if(nums[i]<0){
                negativeCount++;
            }
        }
    return Math.max(positiveCount,negativeCount);
}
}
class Solution {
    public long maximumTripletValue(int[] nums) {
        long maxTriplet=0,maxDiff=0,maxElement=0;
        for(int i=0;i<nums.length;i++){
            maxTriplet=Math.max(maxTriplet,maxDiff*nums[i]);
             maxElement=Math.max(maxElement,nums[i]);
            maxDiff=Math.max(maxDiff,maxElement-nums[i]);
           
        }
        return maxTriplet;
    }
}
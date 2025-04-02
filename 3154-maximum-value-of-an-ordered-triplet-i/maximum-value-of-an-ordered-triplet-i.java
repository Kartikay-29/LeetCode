class Solution {
    public long maximumTripletValue(int[] nums) {
        int n=nums.length;
        long maxTriplet=0,maxElement=0,maxDiff=0;
        for(int i=0;i<n;i++){
             maxTriplet= Math.max(maxTriplet,maxDiff*nums[i]);
              maxDiff= Math.max(maxDiff,maxElement-nums[i]);
             maxElement= Math.max(maxElement,nums[i]);
            
        }
        return maxTriplet;

    }
}
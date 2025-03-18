class Solution {

    public int longestNiceSubarray(int[] nums) {
        int usedBits = 0; 
        int windowStart = 0; 
        int maxLength = 0; 

        for (int windowEnd = 0; windowEnd < nums.length; ++windowEnd) {
            
            
            while ((usedBits & nums[windowEnd]) != 0) {
                usedBits ^= nums[windowStart]; // Remove leftmost element's bits
                windowStart++;
            }

            // Add current number to the window
            usedBits |= nums[windowEnd];

            // Update max length if current window is longer
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }

        return maxLength;
    }
}
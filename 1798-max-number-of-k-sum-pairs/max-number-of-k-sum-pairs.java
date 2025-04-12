class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums); // Sort the array first
        int count = 0;
        int left = 0;
        int right = nums.length - 1;

        // Use two pointers to find pairs that add up to k
        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == k) {
                count++;
                left++;
                right--;
            } else if (sum < k) {
                left++; // Need a bigger sum
            } else {
                right--; // Need a smaller sum
            }
        }

        return count;
    }
}
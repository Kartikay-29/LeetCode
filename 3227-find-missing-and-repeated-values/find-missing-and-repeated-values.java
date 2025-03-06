class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int size = n * n;
        
        long expectedSum = (long) size * (size + 1) / 2;
        long expectedSumOfSquares = (long) size * (size + 1) * (2 * size + 1) / 6;
        
        long actualSum = 0;
        long actualSumOfSquares = 0;
        for (int[] row : grid) {
            for (int num : row) {
                actualSum += num;
                actualSumOfSquares += (long) num * num;
            }
        }
        
        
        long sumDiff = expectedSum - actualSum; 
        long sumOfSquaresDiff = expectedSumOfSquares - actualSumOfSquares;
        
        long sum = sumOfSquaresDiff / sumDiff;
        
        long missing = (sum + sumDiff) / 2;
        long repeated = missing - sumDiff;
        
        return new int[] {(int) repeated, (int) missing};
    }
}

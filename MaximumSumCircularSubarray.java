class Solution {
    public int maxSubarraySumCircular(int[] A) {
        int total = 0;
        int maxSum = Integer.MIN_VALUE;
        int currentMax = 0;
        int minSum = Integer.MAX_VALUE;
        int currentMin = 0;
        for (int a : A) {
            currentMax = Math.max(currentMax + a, a);
            maxSum = Math.max(maxSum, currentMax);
            currentMin = Math.min(currentMin + a, a);
            minSum = Math.min(minSum, currentMin);
            total += a;
        }
        return maxSum > 0 ? Math.max(maxSum, total - minSum) : maxSum;
    }
}
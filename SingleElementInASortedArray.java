class Solution {
    public int singleNonDuplicate(int[] nums) {
        int singleElement = nums[0];
        for(int i=1; i<nums.length; ++i) {
            singleElement ^= nums[i];
        }
        return singleElement;
    }
}
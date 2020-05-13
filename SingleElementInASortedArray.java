class Solution {
    public int singleNonDuplicate(int[] nums) {
        int singleElement = nums[0];
        for(int i=1; i<nums.length; ++i) {
            singleElement ^= nums[i];
        }
        return singleElement;
    }
}

/*
MY ALTERNATE SOLUTION

Since the array is sorted, we can just traverse from left to right to find the unique number

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int previous = nums[0];
        int i = 1;
        int size = nums.length;
        while(i < size-1) {
            int current = nums[i];
            if(previous == current) {
                previous = nums[++i];
                i++;
            } else {
                return previous;
            }
        }
        return previous;
    }
}
*/
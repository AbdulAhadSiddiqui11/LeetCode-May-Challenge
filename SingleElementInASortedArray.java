class Solution {
	// O(N)
    public int singleNonDuplicate(int[] nums) {
        int singleElement = nums[0];
        for(int i=1; i<nums.length; ++i) {
            singleElement ^= nums[i];
        }
        return singleElement;
    }
}
/*
MY ALTERNATE SOLUTION - O(N) 

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
/*
Optimal Solution using Binary Search O(lg(N))

Idea : Since the array is sorted and have each element repeated twice that must mean that if we divide the array in half, 
			if every element on the left - sub array is repeated twice  then  we  must find   arr[even_index] == arr[odd_index]
				i.e the pair starts from even indices (0,1) (2,3) (4,5). Therefore  we  find  the  even_index of mid and check whether
					the pair exists, if it exits then left-sub array only contains repeated pairs (since the order is followed even == odd)
						if that is not the case then the one unique element is present in left sub array [0 - mid] which is making the order fail.
							Same is the case with right sub-array. Hence Binary Search is the optimal solution.
							
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while(left < right) {
            int mid = left + (right - left)/2;
            if(mid%2 == 1) {
                --mid;
            }
            if(nums[mid] != nums[mid+1]) {
                right = mid;
            } else {
                left = mid + 2;
            }
        }
        return nums[left];
    }
}

*/

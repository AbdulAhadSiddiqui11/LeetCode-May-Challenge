/* 
Initial Solution - Time = O(N) ; Space O(N)

	class Solution {
		public int majorityElement(int[] nums) {
			int size = nums.length;
			int resultantElement = 0;
			Map<Integer,Integer> frequency = new HashMap<Integer,Integer>();
			for(int num : nums) {
				if(!frequency.containsKey(num)) {
					frequency.put(num,1);
				} else {
					int currentCount = frequency.get(num);
					frequency.put(num,currentCount+1);
				}
			}
			for(int num : frequency.keySet()) {
				if(frequency.get(num) > (size/2)) {
					resultantElement = num;
					break;
				}
			}
			return resultantElement;
		}
	}
*/


/*
New Solution using Moore's Voting Algorithm
Time = O(N)
Space = O(1)
*/

class Solution {
    public int majorityElement(int[] nums) {
        int majorityElementIndex = 0;
        int count = 1;
        int length = nums.length;
        for(int i=1; i<length; ++i) {
            if(nums[i] == nums[majorityElementIndex]) {
                ++count;
            } else {
                --count;
            }
            if(count == 0) {
                majorityElementIndex = i;
                count = 1;
            }
        }
        return nums[majorityElementIndex];
    }
}
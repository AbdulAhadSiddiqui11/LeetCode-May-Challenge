/* My initial solution using binary search O(lg(num)) -> TLE

		class Solution {
			public boolean isPerfectSquare(int num) {
				long low = 0;
				long high = num;
				while(low <= high) {
					long mid = low + (high - low)/2;  // long because (mid * mid) will overflow for int
					if(mid*mid == num) {
						return true;
					} else if (mid * mid > num) {
						high = mid - 1;
					} else {
						low = mid + 1;
					}
				}
				return false;
			}
		}
*/


class Solution {
    /*
    1 = 1
    4 = 1 + 3
    9 = 1 + 3 + 5
    16 = 1 + 3 + 5 + 7
    25 = 1 + 3 + 5 + 7 + 9
    36 = 1 + 3 + 5 + 7 + 9 + 11
    */
    public boolean isPerfectSquare(int num) {
        // Time complexity == O(sqrt(num)) < O(lg(num)) 
        int i = 1;
        while(num > 0) {
            num -= i;
            i += 2;
        }
        return num == 0;
    }
}
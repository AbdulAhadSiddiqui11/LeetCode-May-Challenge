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
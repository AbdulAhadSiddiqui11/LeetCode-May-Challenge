class Solution {
    public int firstUniqChar(String s) {
        //Use HashMap for better space effieiency .. still O(N) space though
        int frequency[] = new int[26];
        for(char c : s.toCharArray()) {
            frequency[c - 'a']++;
        }
        int index = 0;
        for(char c: s.toCharArray()) {
            if(frequency[c - 'a'] == 1) {
                return index;
            }
            ++index;
        }
        return -1;
    }
}
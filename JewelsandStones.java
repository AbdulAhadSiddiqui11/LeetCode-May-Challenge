class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int noOfJewels = 0;
        int[] jewelFrequency = new int[58];
        
        for (int i=0; i<stones.length(); ++i){
            jewelFrequency[stones.charAt(i) - 'A']++;
        }
        
        for(int j=0; j<jewels.length(); ++j) {
            noOfJewels += jewelFrequency[jewels.charAt(j) - 'A'];
        }
        return noOfJewels;
    }
}
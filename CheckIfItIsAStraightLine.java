class Solution {
    private double getSlope(int[] point1, int[] point2) {
        int numerator = point2[1] - point1[1];
        int denominator = point2[0] - point1[0];
        if (denominator == 0) {
            return denominator / numerator;
        }
        return numerator/denominator;
    }
    public boolean checkStraightLine(int[][] coordinates) {
        if(coordinates.length == 2) {
            return true;
        }
        
        double slope = getSlope(coordinates[0], coordinates[1]);
        int y1 = coordinates[0][1];
        int x1 = coordinates[0][0];
        
        // Check if every point lies on the line eqn formed by first two points
        // Two point line eqn : [y - y1 = m (x - x1)] 
        // where y1 and x1 are coordinates of any point on the line 
         
        
        for(int i=2; i<coordinates.length; ++i) {
            if(coordinates[i][1] - y1 != slope * (coordinates[i][0] - x1)) {
                return false;
            }
        }
        return true;
    }
}
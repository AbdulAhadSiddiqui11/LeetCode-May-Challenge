class Solution {
    private void floodFillDFS(int[][] image, int sr, int sc, int newColor, int oldColor) {
        if(sr < 0 || sc < 0 || sr > image.length-1 || sc > image[0].length-1 || image[sr][sc] != oldColor) {
            return;
        }
        image[sr][sc] = newColor;
        floodFillDFS(image,sr-1,sc,newColor,oldColor);
        floodFillDFS(image,sr+1,sc,newColor,oldColor);
        floodFillDFS(image,sr,sc-1,newColor,oldColor);
        floodFillDFS(image,sr,sc+1,newColor,oldColor);
    }
    
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int oldColor = image[sr][sc];
        if(newColor == oldColor) {
            return image;
        }
        floodFillDFS(image,sr,sc,newColor,oldColor);
        return image;
    }
}
public class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int n = image.length;
        int m = image[0].length;
        int originalColor = image[sr][sc];
        floodFillHelper(image,n,m,sr,sc,originalColor,newColor);
        return image;
    }
    private void floodFillHelper(int[][] image,int n, int m, int x, int y,int originalColor,int newColor){
        if(x<0||x>=n||y<0||y>=m||image[x][y]!=originalColor||image[x][y]==newColor)
            return;
        image[x][y] = newColor;
        floodFillHelper(image,n,m,x,y+1,originalColor,newColor);
        floodFillHelper(image,n,m,x,y-1,originalColor,newColor);
        floodFillHelper(image,n,m,x+1,y,originalColor,newColor);
        floodFillHelper(image,n,m,x-1,y,originalColor,newColor);
    }
}

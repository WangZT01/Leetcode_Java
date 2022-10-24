package Top75;

import java.util.LinkedList;
import java.util.Queue;

public class floodfill_75 {

    /**
     *
     * @param image
     * @param sr
     * @param sc
     * @param color
     * @return
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int color = image[sr][sc];
        if (color != newColor) dfs(image, sr, sc, color, newColor);
        return image;
    }
    public void dfs(int[][] image, int r, int c, int color, int newColor) {
        if (image[r][c] == color) {
            image[r][c] = newColor;
            if (r >= 1) dfs(image, r-1, c, color, newColor);
            if (c >= 1) dfs(image, r, c-1, color, newColor);
            if (r+1 < image.length) dfs(image, r+1, c, color, newColor);
            if (c+1 < image[0].length) dfs(image, r, c+1, color, newColor);
        }
    }
     **/
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int m = image.length;
        int n = image[0].length;
        int target = image[sr][sc];
        Queue<Integer> q = new LinkedList<Integer>();
        int i,j;
        q.offer(sr);
        q.offer(sc);
        while(q.size() != 0){

            i = q.poll();
            j = q.poll();
            image[i][j] = color;

            if(i - 1 >= 0 && image[i - 1][j] == target && image[i - 1][j] != color){
                q.offer(i - 1);
                q.offer(j);
            }
            if(i + 1 < m && image[i + 1][j] == target && image[i + 1][j] != color){
                q.offer(i + 1);
                q.offer(j);
            }

            if(j - 1 >= 0 && image[i][j - 1] == target && image[i][j - 1] != color){
                q.offer(i);
                q.offer(j-1);
            }
            if(j + 1 < n && image[i][j + 1] == target && image[i][j + 1] != color){
                q.offer(i);
                q.offer(j + 1);
            }

        }
        return image;
    }
}

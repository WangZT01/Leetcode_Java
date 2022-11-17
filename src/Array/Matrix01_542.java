package Array;

import java.util.*;

public class Matrix01_542 {
    public int[][] updateMatrix(int[][] mat) {

        int m = mat.length;
        int n = mat[0].length;
        Queue<int[]> q = new LinkedList<int[]>();
        for(int i = 0; i < m; i++){
            for(int j =0; j < n; j++){

                if(mat[i][j] == 0){
                    q.offer(new int[]{i,j});
                }
                else{
                    mat[i][j] = -1;
                }
            }
        }
        int direct[][] = new int[][]{ {0, 1}, {0, -1}, {-1, 0}, {1, 0} };
        if( (m*n) != q.size()){

            while( !q.isEmpty() ){

                int[] temp = q.poll();
                int dis = mat[temp[0]][temp[1]];
                for(int[] dic : direct){

                    int r = temp[0] + dic[0];
                    int c = temp[1] + dic[1];

                    if(r < 0 || c < 0 || r >= m || c >= n || mat[r][c] != -1){
                        continue;
                    }
                    else{
                        if(dis == -1)
                            dis = 0;
                        else{
                            mat[r][c] = dis + 1;
                        }
                        q.offer(new int[]{r,c});
                    }

                }

            }
        }

        return mat;
    }

}

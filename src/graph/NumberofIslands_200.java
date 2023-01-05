package graph;

import java.util.LinkedList;
import java.util.Queue;

public class NumberofIslands_200 {

    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int num = 0;
        int p = 0;
        boolean visited[][] = new boolean[m][n];

        for(int i = 0; i < m; i++){

            for(int j = 0 ; j < n; j++){

                if( !visited[i][j] && grid[i][j] != '0'){
                    //bfs
                    int direct[][] = {{1,0}, {-1,0}, {0,1}, {0,-1}};
                    Queue<int[]> q = new LinkedList<int[]>();
                    q.offer(new int[]{i,j});
                    while(!q.isEmpty()){
                        int t[] = q.poll();
                        visited[t[0]][t[1]] = true;
                        for(int k = 0 ;k < direct.length; k++){
                            int newt0 = t[0] + direct[k][0];
                            int newt1 = t[1] + direct[k][1];

                            if( newt0 >= 0 && newt0 < m && newt1 >= 0 && newt1 < n){

                                if( grid[newt0][newt1] != '0' && !visited[newt0][newt1]){
                                    System.out.println(newt0 + " "+ newt1);
                                    q.offer(new int[]{newt0, newt1});
                                    visited[newt0][newt1] = true;
                                    //System.out.println(i + " " + j);
                                }

                            }
                        }
                    }
                    num++;
                }
            }
        }
        return num;
    }

}

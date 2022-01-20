package graph;

public class MatrixUDG {
    private char[] mVexs; // 顶点集合
    private int[][] mMatrix;

    public MatrixUDG(char[] vexs, char[][] edges){
        int vlen = vexs.length;
        int elen = edges.length;
        if ( vlen < 1 || elen < 1 || (elen > (vlen*(vlen - 1)))) {
            System.out.printf("input error: invalid parameters!\n");
            return ;
        }
        mVexs = new char[vlen];

        for(int i = 0; i < mVexs.length; i++){
            mVexs[i] = vexs[i];
        }
        mMatrix = new int[vlen][vlen];
        for(int i = 0; i < elen; i++){
            int p1 = getPosition(edges[i][0]);
            int p2 = getPosition(edges[i][1]);
            mMatrix[p1][p2] = 1;
            mMatrix[p1][p2] = 1;
        }
    }

    private int getPosition(char ch) {
        for(int i=0; i<mVexs.length; i++)
            if(mVexs[i]==ch)
                return i;
        return -1;
    }
    /*
     * 创建图(自己输入数据)
     */


    public static void main(String[] args) {
        char[] vexs = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        char[][] edges = new char[][]{
                {'A', 'C'},
                {'A', 'D'},
                {'A', 'F'},
                {'B', 'C'},
                {'C', 'D'},
                {'E', 'G'},
                {'F', 'G'}};
        MatrixUDG pG;

        // 自定义"图"(输入矩阵队列)
        //pG = new MatrixUDG();
        // 采用已有的"图"
        pG = new MatrixUDG(vexs, edges);

        //pG.print();   // 打印图
    }
}

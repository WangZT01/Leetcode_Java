package graph;

public class ListDG {

    private class ENode{
        int ivex; // 边指向的顶点位置
        ENode nextEdge; // 指向下一个弧
    }
    private  class VNode{
        char data; // 顶点信息
        ENode firstEdge; //指向这个点的第一条弧
    }
    private VNode[] mVexs; //顶点数组

    public ListDG(char[] vexs, char[][] edges){
        int vlen = vexs.length;
        int elen = edges.length;

        mVexs = new VNode[vlen];

        for (int i = 0; i < mVexs.length; i++) {
            mVexs[i] = new VNode();
            mVexs[i].data = vexs[i];
            mVexs[i].firstEdge = null;
        }
        for(int i = 0; i< elen; i++){
            char c1 = edges[i][0];
            char c2 = edges[i][0];
            int p1 = getPosition(c1);
            int p2 = getPosition(c2);
            ENode e = new ENode();
            e.ivex = p2;
            if(mVexs[p1].firstEdge == null){
                mVexs[p1].firstEdge = e;
            }
            else{
                linkLast(mVexs[p1].firstEdge, e);
            }
        }
    }

    private void linkLast(ENode list, ENode node) {
        ENode p = list;

        while(p.nextEdge!=null)
            p = p.nextEdge;
        p.nextEdge = node;
    }

    /*
     * 返回ch位置
     */
    private int getPosition(char ch) {
        for(int i=0; i<mVexs.length; i++)
            if(mVexs[i].data==ch)
                return i;
        return -1;
    }
    public void dfs(VNode[] arr) {
        boolean[] b = new boolean[arr.length];
        System.out.println();
        for (int j = 0, len = arr.length; j < len; j++) {
            //如果这个顶点没有被访问过
            if (!b[j]) {
                b[j] = true;
                System.out.print(mVexs[j].data + " ");
                ENode e = new ENode();
                e = mVexs[j].firstEdge;
                while(e != null){

                    System.out.print(e.ivex + " ");
                    e = mVexs[e.ivex].firstEdge;
                    while(!b[mVexs[e.ivex].firstEdge.ivex]){
                        e = e.nextEdge;
                    }
                    System.out.print(e.ivex + " ");
                    b[e.ivex] = true;
                }
            }
        }
        System.out.println();
    }


}

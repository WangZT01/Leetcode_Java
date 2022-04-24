package Tree;

public class RedundantConnection_684 {

    public int[] findRedundantConnection(int[][] edges) {

        int i = 0;
        int a[] = new int[edges.length];
        for(i = 0; i < edges.length; i++){
            a[i] = i;
        }
        for(i = 0; i <  edges.length; i++){

            int node1 = edges[i][0];
            int node2 = edges[i][1];

            while(a[node1] != node1){
                node1 = a[node1];
            }
            while(a[node2] != node2){
                node2 = a[node2];
            }

            if(node1 != node2){
                a[node2] = node1;
            }
            else if(node1 == node2){
                break;
            }

        }
        return edges[i];
    }

}

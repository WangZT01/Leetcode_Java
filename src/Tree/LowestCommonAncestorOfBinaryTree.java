package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LowestCommonAncestorOfBinaryTree {


    /**
     * wrong answer
     * @param root
     * @param p
     * @param q
     * @return
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int indexp = 0, indexq = 0;
        int count = 0;

        ArrayList<TreeNode> list = new ArrayList<TreeNode>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode current = queue.poll();
            list.add(current);

            if(current == null){
            }
            else{
                if(current.val == q.val){
                    indexq = count;
                }
                if(current.val == p.val){
                    indexp = count;
                }
                queue.offer(current.left);
                queue.offer(current.right);
            }
            count++;
        }
        if(indexq < indexp){
            int t = indexq;
            indexq = indexp;
            indexp = t;
        }

        while( indexp != indexq){
            System.out.println(indexp + " " + indexq);
            if(indexq > indexp)
                indexq = (indexq - 1)/2;
            if(indexq < indexp)
                indexp = (indexp - 1)/2;
        }

        return list.get(indexp);
    }
}

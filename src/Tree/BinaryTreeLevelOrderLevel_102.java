package Tree;

import java.util.*;

public class BinaryTreeLevelOrderLevel_102 {

    public List<List<Integer>> levelOrder(TreeNode root) {

        int depth = 0;
        Queue<TreeNode> qNode = new LinkedList<TreeNode>();
        Queue<Integer> qDepth = new LinkedList<Integer>();
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(root == null)
            return list;
        qNode.offer(root);
        qDepth.offer(0);

        while(!qNode.isEmpty()){

            TreeNode current = qNode.poll();
            int currentDepth = qDepth.poll();

            if(current.left != null){
                qNode.offer(current.left);
                qDepth.offer(currentDepth + 1);
            }
            if(current.right != null){
                qNode.offer(current.right);
                qDepth.offer(currentDepth + 1);
            }

            if(currentDepth + 1 <= list.size()){

                List<Integer> l = list.get(currentDepth);
                l.add(current.val);
                list.set(currentDepth, l );
            }
            else{

                List<Integer> l = new ArrayList<Integer>();
                l.add(current.val);
                list.add(l);
            }
        }

        return list;
    }
}

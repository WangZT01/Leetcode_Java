package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class DiameterofBinaryTree {


    /**
     *
     * Another solution
     * save the max diameter bby using a "global parameter"
     *
     * public class Solution {
     *     int max = 0;
     *
     *     public int diameterOfBinaryTree(TreeNode root) {
     *         maxDepth(root);
     *         return max;
     *     }
     *
     *     private int maxDepth(TreeNode root) {
     *         if (root == null) return 0;
     *
     *         int left = maxDepth(root.left);
     *         int right = maxDepth(root.right);
     *
     *         max = Math.max(max, left + right);
     *
     *         return Math.max(left, right) + 1;
     *     }
     * }
     */


    /**
     * Not too fast and memory-saving
     * @param root
     * @return
     */
    public int diameterOfBinaryTree(TreeNode root) {

        if(root == null)
            return 0;
        int maxDiameter = 0;
        //bfs
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode currentNode = q.poll();
            int diameter = maxDepth(currentNode.left) + maxDepth(currentNode.right);
            if(maxDiameter < diameter){
                maxDiameter = diameter;
            }
            if(currentNode.left != null){
                q.offer(currentNode.left);
            }
            if(currentNode.right != null){
                q.offer(currentNode.right);
            }
        }
        return maxDiameter;
    }

    public int maxDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}

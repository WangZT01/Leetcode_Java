package Tree;

import java.util.*;

public class BinaryTreeRightSideView_199 {
    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> ans = new LinkedList<>();
        if(root == null){
            return ans;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        TreeNode node = root;
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> level = new LinkedList<>();
            for(int i = 0; i < size; i++){
                node = q.poll();
                if(node.left != null){
                    q.add(node.left);
                }
                if(node.right != null){
                    q.add(node.right);
                }
            }
            ans.add(node.val);
        }
        return ans;

    }
}

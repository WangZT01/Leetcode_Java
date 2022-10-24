package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DFS {

    public List<TreeNode> DFS(TreeNode root){

        List<TreeNode> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while (!stack.empty()) {
            TreeNode node = stack.peek();
            res.add(node);
            stack.pop();
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
        return res;

    }

}

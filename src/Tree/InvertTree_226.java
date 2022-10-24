package Tree;

public class InvertTree_226 {
    public TreeNode invertTree(TreeNode root) {

        if(root == null){
            return null;
        }
        if(root.left == null && root.right == null){
            return root;
        }

        TreeNode t = root.left;
        root.left = root.right;
        root.right = t;

        if(root.left != null){
            invertTree(root.left);
        }
        if(root.right != null){
            invertTree(root.right);
        }
        return root;
    }
}

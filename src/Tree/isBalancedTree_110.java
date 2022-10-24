package Tree;

public class isBalancedTree_110 {

    public boolean isBalanced(TreeNode root) {

        if(root == null){
            return true;
        }
        // if current tree is not balance, return false
        if(Math.abs(getHeight(root.left) - getHeight(root.right)) > 1){
            return false;
        }
        // otherwise, continue checking its child node.
        else{
            return isBalanced(root.left) && isBalanced(root.right);
        }

    }

    public int getHeight(TreeNode root){

        if(root == null){
            return 0;
        }
        return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
    }
}

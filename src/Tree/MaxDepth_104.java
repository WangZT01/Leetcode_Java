package Tree;

public class MaxDepth_104 {
    //regular solution with recursion
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
    //using dfs to find the deepest node, then continue return its father node until we get the root.
}

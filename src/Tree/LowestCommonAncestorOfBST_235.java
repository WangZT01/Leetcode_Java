package Tree;

public class LowestCommonAncestorOfBST_235 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {


        if(q.val < root.val && p.val < root.val){
            root = root.left;
        }
        else if(q.val > root.val && p.val > root.val){
            root = root.right;
        }
        else{
            return root;
        }
        return lowestCommonAncestor(root, p, q);
    }
}

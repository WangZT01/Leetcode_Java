package Tree;

import java.util.Arrays;

public class ConstructBinaryTreefromPreorderandInoeder_105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        if(preorder.length == 0 || inorder.length == 0){
            return null;
        }

        TreeNode root = new TreeNode(preorder[0]);
        int inroot = 0;
        for(; inroot <  inorder.length; inroot++){
            if(inorder[inroot] == root.val){
                break;
            }
        }
        int[] leftpre = Arrays.copyOfRange(preorder, 1, inroot + 1);
        int[] leftin = Arrays.copyOfRange(inorder, 0, inroot);
        root.left = buildTree(leftpre, leftin);

        int[] rightpre = Arrays.copyOfRange(preorder, inroot + 1, preorder.length);
        int[] rightin = Arrays.copyOfRange(inorder, inroot + 1, inorder.length);
        root.right = buildTree(rightpre, rightin);

        return root;
    }
}

package Tree;


public class AVLTree <T extends Comparable<T>> {

    private AVLTreeNode<T> root;

    class AVLTreeNode<T extends Comparable<T>>{
        T key;
        int height;
        AVLTreeNode<T> left;
        AVLTreeNode<T> right;

        public AVLTreeNode(T key, AVLTreeNode<T> left, AVLTreeNode<T> right){
            this.key = key;
            this.left = left;
            this.right = right;
            this.height = 0;
        }
    }
    public  AVLTree(){
        root = null;
    }
    private int height(AVLTreeNode<T> tree){
        if(tree != null){
            return tree.height;
        }
        return 0;
    }

    public int height(){
        return height(root);
    }

    /**
    pre-order
    **/
    private void preOrder(AVLTreeNode<T> tree){
        if(tree != null){
            System.out.println(tree.key + " ");
            preOrder(tree.left);
            preOrder(tree.right);
        }
    }
    public void preOrder(){
        preOrder(root);
    }

    /**
     * search
     */
    private  AVLTreeNode<T> search(AVLTreeNode<T> x, T key){
        if(x == null){
            return x;
        }
        int cmp = key.compareTo(x.key);
        if(cmp < 0){
            return search(x.left, key);
        }
        else if(cmp > 0){
            return search(x.right, key);
        }
        else
            return x;
    }

    /**
     * return min
     * @param tree
     * @return
     */
    private AVLTreeNode<T> minimum(AVLTreeNode<T> tree) {
        if (tree == null)
            return null;

        while(tree.left != null)
            tree = tree.left;
        return tree;
    }

    public T minimum() {
        AVLTreeNode<T> p = minimum(root);
        if (p != null)
            return p.key;
        return null;
    }
}
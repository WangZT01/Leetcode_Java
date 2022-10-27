package Tree;

import java.util.*;

public class SerializeAndDeserializeTree_297 {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {

        if(root == null){
            return null;
        }
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        ArrayList<String> ser = new ArrayList<String>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode node = q.poll();

            if(node != null){
                ser.add(String.valueOf(node.val));
                //System.out.print(node.val + " ");

                q.offer(node.left);
                q.offer(node.right);

            }
            else{
                ser.add("*");
                //System.out.print("*" + " ");
            }

        }
        return String.join(",", ser);
    }


    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data == null){
            return null;
        }

        String[] nodes = data.split(",");

        int end = nodes.length - 1;

        while(nodes[end].equals("*")){
            end--;
        }

        Queue<TreeNode> q = new LinkedList<TreeNode>();
        TreeNode root = new TreeNode(Integer.valueOf(nodes[0]));
        q.offer(root);
        int count = 1;
        while(count < end + 1){

            TreeNode node = q.poll();
            if(node != null){
                if(nodes[count].equals("*")){
                    node.left = null;
                }
                else{
                    node.left = new TreeNode(Integer.valueOf(nodes[count]));

                }
                count++;
                q.offer(node.left);
                if(count == nodes.length)
                    break;
                if(nodes[count].equals("*")){
                    node.right = null;
                }
                else{
                    node.right = new TreeNode(Integer.valueOf(nodes[count]));
                }
                count++;
                q.offer(node.right);
            }


        }

        return root;
    }
}

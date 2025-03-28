/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
       StringBuilder res= new StringBuilder();

       helpserialize(root,res);
       return res.toString();

    }
    
    private void helpserialize(TreeNode root,StringBuilder res){
        if(root==null){
            res.append("x,");
            return;
        }
        res.append(root.val);
        res.append(',');

        helpserialize(root.left,res);
        helpserialize(root.right,res);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Deque<String> q= new LinkedList<>();
         q.addAll(Arrays.asList(data.split(",")));
         return helpdeserialize(q);
    }
     private TreeNode helpdeserialize(Deque<String>q){
        String res= q.remove();
        if(res.equals("x")){
            return null;
        }
        TreeNode root= new TreeNode(Integer.parseInt(res));
        root.left= helpdeserialize(q);
        root.right= helpdeserialize(q);
        return root;
     }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;
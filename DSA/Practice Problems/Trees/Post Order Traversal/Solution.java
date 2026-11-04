/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> postorderList = new ArrayList<Integer>();
        if(root == null){
            return postorderList;//return an empty list
        }
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        TreeNode node = null;
        //add the root to the first stack
        stack1.push(root);
        //iterate through the first stack
        while(!stack1.isEmpty()){
            node = stack1.pop();//remove the current visited node
            stack2.push(node);//push to stack 2
            //check the left + right sub trees
            if(node.left != null){
                stack1.push(node.left);
            }
            if(node.right != null){
                stack1.push(node.right);
            }
        }

        //add elements to the postorder treversal list 
        while(!stack2.isEmpty()){
            node = stack2.pop();
            postorderList.add(node.val);
        }

        return postorderList;


        
    }
}

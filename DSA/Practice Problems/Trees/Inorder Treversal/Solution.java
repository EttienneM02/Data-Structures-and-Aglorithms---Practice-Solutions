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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inOrderList = new ArrayList<Integer>();
        //constraints
        if(root == null){
            return inOrderList;//break out of the function with an empty list
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while(true){
            
            if(node != null){
            //add to stack
            stack.push(node);
            //move to the left
            node = node.left;    
            }else{
                //if we reach the inner most left node
                //check the stack
                if(stack.isEmpty()){
                    break;//break out of the loop
                }
                //pop the current left node from the stack
                node = stack.pop();
                //add to list
                inOrderList.add(node.val);
                //move to the right
                node = node.right; 
            }
            
        }
        return inOrderList;
    }
}

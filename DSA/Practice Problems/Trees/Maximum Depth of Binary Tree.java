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
    public int maxDepth(TreeNode root) {
        int depth = 0;
        //depth = 1;//counting first node encountered -> the initial depth
       if(root == null){
        return depth;//return 0
       }
       Queue<TreeNode> queue = new LinkedList<>();
        //add our root to the queue
        queue.offer(root);
        while(!queue.isEmpty()){
           //get all the nodes on a specific level -> add the next level of nodes (add their childern) 
            //we are getting all the nodes of one level and incrementing the depth after all the nodes of the level have been checked
            int size = queue.size();//iterate through the current nodes of this level
            for(int i = 0; i < size; i++){
                TreeNode currentNode = queue.poll();
                if(currentNode.left != null){
                queue.offer(currentNode.left);
                }
                if(currentNode.right != null){
                queue.offer(currentNode.right);
                }
                
            }
            depth++;//a level is fully processed
            

        }
        return depth;
    }
}

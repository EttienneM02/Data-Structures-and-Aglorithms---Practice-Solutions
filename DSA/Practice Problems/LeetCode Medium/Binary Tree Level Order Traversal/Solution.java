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
    public List<List<Integer>> levelOrder(TreeNode root) {
        //Queue
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> list = new LinkedList<List<Integer>>();

        //constraint -> if root is null -> return an empty list
        if(root == null){
            return list;
        }
        
        //first step add the root to the queue
        queue.offer(root);
        //second step -> always retreive the next set of nodes and add to queue, till all nodes have been exhausted
        while(!queue.isEmpty()){
            int lvlNodeCount = queue.size();//keeps track of the number of Nodes in a queue
            List<Integer> nodeList = new LinkedList<>();
            for(int i = 0; i < lvlNodeCount;i++){//iterate through the Nodes of that level
                if(queue.peek().left != null){
                    queue.offer(queue.peek().left);//add left node to queue
                }
                if(queue.peek().right != null){
                    queue.offer(queue.peek().right);//add right node to queue
                }
                nodeList.add(queue.poll().val);//get the current value from the queue and add to the list
            }
            list.add(nodeList);
        }
        return list;
    }
}

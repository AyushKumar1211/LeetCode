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
    public int kthSmallest(TreeNode root, int k) {
       ArrayList<Integer> ans = new ArrayList<>();
       inOrder(root,ans);
       return ans.get(k-1); 
    }
    void inOrder(TreeNode head, ArrayList<Integer> ans){
        if(head==null){
            return;
        }
        inOrder(head.left,ans);
        ans.add(head.val);
        inOrder(head.right,ans);
    }
}
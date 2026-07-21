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
       int count=0;
       inOrder(root,ans,k,count);
       return ans.get(k-1); 
    }
    void inOrder(TreeNode head, ArrayList<Integer> ans,int k, int count){
        if((head==null)||(k<=count)){
            return;
        }
        inOrder(head.left,ans,k,count);
        if(count<k){
            count++;
        }
        ans.add(head.val);
        inOrder(head.right,ans,k,count);
    }
}
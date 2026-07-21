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
       int answer =0 ;
       inOrder(root,ans,k,count,answer);
       return ans.get(k-1); 
    }
    void inOrder(TreeNode head, ArrayList<Integer> ans,int k, int count,int answer){
        if(head==null){
            return;
        }
        inOrder(head.left,ans,k,count,answer);
        ans.add(head.val);
        if(count<k){
            count++;
        }
        else{
            answer = head.val;
            return;
        }
        inOrder(head.right,ans,k,count,answer);
    }
}
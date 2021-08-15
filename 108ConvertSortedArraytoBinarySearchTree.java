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
    public TreeNode binerySearch(int[] nums, int left, int right){
        if(left>right){
            return null;
        }
        int mid= left+((right-left)/2);
        TreeNode node= new TreeNode(nums[mid]);
        node.right= binerySearch(nums, mid+1, right);
        node.left= binerySearch(nums, left, mid-1);
        return node;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode ans= binerySearch(nums, 0, nums.length-1);
        return ans;
    }
}

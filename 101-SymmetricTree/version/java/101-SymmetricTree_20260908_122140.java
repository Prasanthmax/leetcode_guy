// Last updated: 08/09/2026, 12:21:40
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public int minDepth(TreeNode root) {
18        if(root==null){
19            return 0;
20        }
21        int left=minDepth(root.left);
22        int right=minDepth(root.right);
23        if(left==0 && right!=0){
24            return right+1;
25        }
26        if(left!=0 && right==0){
27            return left+1;
28        }
29        return Math.min(left,right)+1;
30    }
31}
// Last updated: 08/09/2026, 11:55:27
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
17    public boolean isSymmetric(TreeNode root) {
18        return mirror(root.left,root.right);
19    }
20    public boolean mirror(TreeNode left, TreeNode right){
21        if(left==null && right==null){
22            return true;
23        }
24        if(left==null || right==null){
25            return false;
26        }
27        if(left.val!=right.val){
28            return false;
29        }
30        return mirror(right.right, left.left) && mirror(right.left, left.right);
31    }
32}
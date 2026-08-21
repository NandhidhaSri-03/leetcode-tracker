// Last updated: 8/21/2026, 11:01:30 AM
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
18        if (root == null)
19		    return true;
20	    return isSymmetric(root.left, root.right);
21    }
22    public boolean isSymmetric(TreeNode rootleft, TreeNode rootright) {
23	    if (rootleft == null && rootright == null) {
24		    return true;
25	    }
26        else if (rootright == null || rootleft == null) {
27		    return false;
28	    }
29        if (rootleft.val != rootright.val)
30		    return false;
31        if (!isSymmetric(rootleft.left, rootright.right))
32		    return false;
33	    if (!isSymmetric(rootleft.right, rootright.left))
34		    return false;
35        return true;
36    }
37}
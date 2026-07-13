// Last updated: 7/13/2026, 9:28:18 AM
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
17    public boolean isSameTree(TreeNode p, TreeNode q) {
18        return compare(p, q);
19    }
20
21    private boolean compare(TreeNode p, TreeNode q) {
22
23        if (p == null && q == null) {
24            return true;
25        }
26
27        if (p == null || q == null) {
28            return false;
29        }
30
31        if (p.val != q.val) {
32            return false;
33        }
34
35        boolean leftSame = compare(p.left, q.left);
36        boolean rightSame = compare(p.right, q.right);
37
38        return leftSame && rightSame;
39    }
40}
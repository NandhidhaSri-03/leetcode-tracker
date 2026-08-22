// Last updated: 8/22/2026, 1:47:31 PM
1class Solution {
2    public boolean isBalanced(TreeNode root) {
3        return check(root) != -1;
4    }
5    private int check(TreeNode node) {
6        if (node == null) return 0;
7        int left_h = check(node.left);
8        if (left_h == - 1) return -1;
9        int right_h = check(node.right);
10        if (right_h == -1) return -1;
11        if (Math.abs(left_h - right_h) > 1) {
12            return -1;
13        }
14        return Math.max(left_h, right_h) + 1;
15    }
16}
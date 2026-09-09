// Last updated: 9/9/2026, 2:04:38 PM
1class Solution {
2    private class ListNode {
3        private int val;
4        private ListNode next;
5        public ListNode() {} 
6        public ListNode(int val) {this.val = val;} 
7    } 
8    private class Pair {
9        private ListNode head, cur;
10        public Pair() {} 
11        public Pair(ListNode head, ListNode cur) {
12            this.head = head;
13            this.cur = cur;
14        }
15    } 
16    public int[] loudAndRich(int[][] richer, int[] quiet) {
17        int m = quiet.length;
18        Pair[] map = new Pair[m];
19        for (int[] rich : richer) {
20            int a = rich[0], b = rich[1];
21            ListNode node = new ListNode(a);
22            if (map[b] == null) map[b] = new Pair(node, node);
23            else {
24                map[b].cur.next = node;
25                map[b].cur = node;
26            }
27        } 
28        int[] res = new int[m]; 
29        Arrays.fill(res, -1); 
30        for (int i = 0; i < m; i++) {
31            if (res[i] == -1) res[i] = value(i, m, quiet, res, map);
32        } 
33        return res;
34    } 
35    public int value(int source, int m, int[] quiet, int[] res, Pair[] map) {
36        int[] nodes = new int[m];
37        int top = -1; 
38        boolean[] set = new boolean[m];
39        int quietest = source, mn = quiet[quietest];
40        nodes[++top] = source;
41        while (top != -1) {
42            int v = nodes[top--]; 
43            ListNode pres = map[v] == null ? null : map[v].head;
44            while (pres != null) {
45                int f = pres.val;
46                if (!set[f]) {
47                    if (res[f] != -1) {
48                        int r = res[f];
49                        if (quiet[r] < mn) {
50                            mn = quiet[r];
51                            quietest = r;
52                        } 
53                    } else { 
54                        int q = quiet[f];
55                        if (q < mn) {
56                            mn = q;
57                            quietest = f;
58                        } 
59                        nodes[++top] = f; 
60                    } 
61                    set[f] = true;
62                } 
63                pres = pres.next;
64            }
65        } 
66        return quietest;
67    }
68}
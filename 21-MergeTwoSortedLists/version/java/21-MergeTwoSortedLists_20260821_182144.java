// Last updated: 8/21/2026, 6:21:44 PM
1class Solution {
2    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
3        ListNode dummyList = new ListNode(0);
4        ListNode headNode = dummyList;
5
6        while (list1 != null && list2 != null) {
7            if (list1.val <= list2.val) {
8                dummyList.next = list1;
9                list1 = list1.next;
10            } else {
11                dummyList.next = list2;
12                list2 = list2.next;
13            }
14
15            dummyList = dummyList.next;
16        }
17
18        // adding last element //
19        if (list1 == null) {
20            dummyList.next = list2;
21        } else {
22            dummyList.next = list1;
23        }
24
25        return headNode.next;
26    }
27}
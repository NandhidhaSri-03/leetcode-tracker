// Last updated: 8/21/2026, 11:03:39 AM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode deleteDuplicates(ListNode head) {
13        if (head == null || head.next == null) return head;
14        ListNode dummy = new ListNode(-1); 
15        dummy.next = head;
16        ListNode prev = dummy;
17        ListNode cur = head;
18        while (cur != null && cur.next != null) {
19            if (cur.val == cur.next.val) {
20                while (cur.next != null && cur.val == cur.next.val) {
21                    cur = cur.next;
22                }
23                prev.next = cur.next; 
24            } else {
25                prev = prev.next; 
26            }
27            cur = cur.next;
28        }
29        return dummy.next;
30    }
31}
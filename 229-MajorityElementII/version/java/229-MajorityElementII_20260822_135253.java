// Last updated: 8/22/2026, 1:52:53 PM
1class Solution {
2    public List<Integer> majorityElement(int[] nums) {
3        int candidate1 = 0, candidate2 = 0, count1 = 0, count2 = 0;
4        for (int num : nums) {
5            if (candidate1 == num) count1++;
6            else if (candidate2 == num) count2++;
7            else if (count1 == 0) {
8                candidate1 = num;
9                count1 = 1;
10            } else if (count2 == 0) {
11                candidate2 = num;
12                count2 = 1;
13            } else {
14                count1--;
15                count2--;
16            }
17        } 
18        count1 = count2 = 0;
19        for (int num : nums) {
20            if (num == candidate1) count1++;
21            else if (num == candidate2) count2++;
22        }
23        List<Integer> ans = new ArrayList<>();
24        if (count1 > nums.length / 3) ans.add(candidate1);
25        if (count2 > nums.length / 3) ans.add(candidate2);
26        return ans;
27    }
28}
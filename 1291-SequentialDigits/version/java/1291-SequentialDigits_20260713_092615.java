// Last updated: 7/13/2026, 9:26:15 AM
1class Solution {
2    public List<Integer> sequentialDigits(int low, int high) {
3
4        String digits = "123456789";
5
6        List<Integer> ans = new ArrayList<>();
7
8        int minLen = String.valueOf(low).length();
9        int maxLen = String.valueOf(high).length();
10
11        for (int len = minLen; len <= maxLen; len++) {
12
13            for (int start = 0; start + len <= 9; start++) {
14
15                int num = Integer.parseInt(digits.substring(start, start + len));
16
17                if (num >= low && num <= high) {
18                    ans.add(num);
19                }
20            }
21        }
22
23        return ans;
24    }
25}
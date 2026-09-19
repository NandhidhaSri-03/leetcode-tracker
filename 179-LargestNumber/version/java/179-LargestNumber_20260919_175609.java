// Last updated: 9/19/2026, 5:56:09 PM
1class Solution {
2    public String largestNumber(int[] nums) {
3        String[] store = new String[nums.length];
4        for (int i = 0; i < nums.length; i++) {
5            store[i] = String.valueOf(nums[i]);
6        }
7        Arrays.sort(store, (a, b) -> {
8            String order1 = a + b;
9            String order2 = b + a;
10            return order2.compareTo(order1); 
11        });
12        if (store[0].equals("0")) return "0";
13        StringBuilder ans = new StringBuilder();
14        for (String s : store) {
15            ans.append(s);
16        }
17
18        return ans.toString();
19    }
20}
// Last updated: 7/9/2026, 5:54:32 PM
1public class Solution {
2    public int subarraySum(int[] nums, int k) {
3        int count = 0;
4      
5        int[] sum = new int[nums.length + 1];
6        sum[0] = 0;
7        for (int i = 1; i <= nums.length; i++)
8            sum[i] = sum[i - 1] + nums[i - 1];
9      
10        for (int start = 0; start < sum.length; start++) {
11            for (int end = start + 1; end < sum.length; end++) {
12                if (sum[end] - sum[start] == k)
13                    count++;
14            }
15        }
16      
17        return count;
18    }
19}
// Last updated: 8/24/2026, 2:42:00 PM
1class Solution {
2    public int singleNumber(int[] nums) {
3        int result=0;
4        for(int i=0; i<nums.length; i++) {
5            result = result^nums[i];
6        }
7        return result;
8    }
9}
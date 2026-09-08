// Last updated: 9/8/2026, 11:56:27 AM
1class Solution {
2    public int missingNumber(int[] nums) {
3        Arrays.sort(nums);
4        for(int i = 0; i < nums.length; i++){
5            if(nums[i] != i){
6                return i;
7            }
8        }
9        return nums.length;
10    }
11}
// Last updated: 9/3/2026, 1:53:12 PM
1class Solution {
2    public void sortColors(int[] nums) {
3        int zeroIndex = 0;
4        int currentIndex = 0;
5        int twoIndex = nums.length - 1;
6        while (currentIndex <= twoIndex) {
7            if (nums[currentIndex] == 0) {
8                int temporaryValue = nums[currentIndex];
9                nums[currentIndex++] = nums[zeroIndex];
10                nums[zeroIndex++] = temporaryValue;
11            } else if (nums[currentIndex] == 2) {
12                int temporaryValue = nums[currentIndex];
13                nums[currentIndex] = nums[twoIndex];
14                nums[twoIndex--] = temporaryValue;
15            } else {
16                currentIndex++;
17            }
18        }
19    }
20}
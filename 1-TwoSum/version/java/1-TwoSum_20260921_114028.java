// Last updated: 9/21/2026, 11:40:28 AM
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        int n=nums.length;
4        Map<Integer,Integer> map=new HashMap<>();
5        int[] result=new int[2];
6        for(int i=0;i<n;i++){
7            if(map.containsKey(target-nums[i])){
8                result[1]=i;
9                result[0]=map.get(target-nums[i]);
10                return result;
11            }
12            map.put(nums[i],i);
13        }
14        return result;
15    }
16}
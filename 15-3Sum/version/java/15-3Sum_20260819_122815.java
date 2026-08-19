// Last updated: 8/19/2026, 12:28:15 PM
1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3        Arrays.sort(nums);
4        List<List<Integer>> res = new ArrayList<>();
5       int n = nums.length;
6       for(int i = 0;i < n - 2;i++){
7        int j = i+1,k = n - 1;
8        if(i > 0 && nums[i] == nums[i-1]) continue;
9        while(j < k){
10            int sum = nums[i] + nums[j] + nums[k];
11            if(sum == 0){
12            res.add(Arrays.asList(nums[i],nums[j],nums[k]));
13            j++;
14            k--;
15            while(j < k && nums[j] == nums[j-1]) j++;
16            }else if(sum < 0) j++;
17            else k--;
18
19        }
20       }
21       return res;
22    }
23}
// Last updated: 7/9/2026, 9:49:04 AM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i < nums.length; i++){
            map.put(nums[i], i);
        }
        for(int i = 0; i < nums.length;i++){
            int tmp = target - nums[i];
            if(map.containsKey(tmp) && map.get(tmp) != i){
                return new int[]{i, map.get(tmp)};
            }
        }
        System.out.print(map);
        return new int[]{};
    }
}
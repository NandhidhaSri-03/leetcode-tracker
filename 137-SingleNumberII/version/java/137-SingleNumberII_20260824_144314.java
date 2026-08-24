// Last updated: 8/24/2026, 2:43:14 PM
1class Solution {
2    public int singleNumber(int[] nums) {
3        Map<Integer,Integer>map=new HashMap<>();
4        for(int val:nums){
5            map.put(val,map.getOrDefault(val,0)+1);
6        }
7        for(Map.Entry<Integer,Integer>entrySet:map.entrySet()){
8            if(entrySet.getValue()==1)return entrySet.getKey();
9        }
10        return -1;
11    }
12}
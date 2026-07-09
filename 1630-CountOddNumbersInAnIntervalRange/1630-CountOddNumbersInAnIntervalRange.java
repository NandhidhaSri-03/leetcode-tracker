// Last updated: 7/9/2026, 9:46:14 AM
class Solution {
    public int countOdds(int low, int high) {
        int nums=high-low+1;
        return (nums +(low%2)) /2;
    }
}
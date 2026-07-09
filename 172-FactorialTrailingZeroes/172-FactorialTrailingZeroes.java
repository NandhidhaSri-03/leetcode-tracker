// Last updated: 7/9/2026, 9:48:02 AM
class Solution {
    public int trailingZeroes(int n) {
        int r=0;
        while(n>0){
            n/=5;
            r += n;
        }
        return r;
    }
}
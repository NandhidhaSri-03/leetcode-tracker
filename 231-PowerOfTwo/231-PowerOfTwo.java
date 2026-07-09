// Last updated: 7/9/2026, 9:47:29 AM
class Solution {
    public boolean isPowerOfTwo(int n) {
        return n>0 && (n&(n-1))==0;
    }
}
// Last updated: 7/9/2026, 9:47:19 AM
class Solution {
    public boolean isPowerOfFour(int n) {
         return n > 0 && (n & (n - 1)) == 0 && (n & 0x55555555) != 0;

    }
}
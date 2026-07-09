// Last updated: 7/9/2026, 9:46:29 AM
class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int sub=0;
        int pro=1;
        while(n>0){
            int digit = n%10;
            sum+=digit;
            pro*=digit;
            n/=10;
        }
        return sub = pro-sum;
    }
}
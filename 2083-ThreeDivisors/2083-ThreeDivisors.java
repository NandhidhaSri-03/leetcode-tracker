// Last updated: 7/9/2026, 9:46:07 AM
class Solution {
    public boolean isThree(int n) {
        int n1 =0;
        for(int i=1;i<=n;i++){
            if(n%i==0)
            n1++;
        }
        if(n1==3)
        return true;
        else
        return false;
    }
}
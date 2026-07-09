// Last updated: 7/9/2026, 9:47:58 AM
class Solution {
    int add(int a){
        int sum=0;
        while(a!=0){
            sum = sum+(a%10)*(a%10);
            a/=10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        while(n>9){
            n=add(n);
        }
        if(n==1||n==7){
            return true;
        }else{
            return false;
        }
    }
}
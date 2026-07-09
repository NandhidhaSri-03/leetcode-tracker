// Last updated: 7/9/2026, 9:46:21 AM
class Solution {
    public int numberOfSteps(int num) {
        int count=0;
        while(num>0){
            if(num%2==0){
                num/=2;
            }else{
                num-=1;
            }
            count++;
        }
        return count;
    }
}
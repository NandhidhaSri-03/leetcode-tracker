// Last updated: 7/14/2026, 10:13:53 AM
1class Solution {
2    public boolean isPalindrome(int x) {
3      if(x<0){
4        return false;
5      }  
6      int org=x;
7      int rev=0;
8      while(x!=0){
9        int digit=x%10;
10        rev=rev*10+digit;
11        x=x/10;
12      }
13      return org==rev;
14    }
15}
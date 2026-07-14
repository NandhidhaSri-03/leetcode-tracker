// Last updated: 7/14/2026, 10:06:00 AM
1class Solution {
2    public int reverse(int x) {
3        int reverse=0;
4        while(x!=0){
5            int digit=x%10;
6            if(reverse>Integer.MAX_VALUE/10||reverse==Integer.MAX_VALUE/10 && digit>7){
7                return 0;
8            }
9            if(reverse<Integer.MIN_VALUE/10||reverse==Integer.MIN_VALUE/10 && digit<-8){
10                return 0;
11            }
12            reverse=reverse*10+digit;
13            x=x/10;
14        }
15        return reverse;
16    }
17    
18}
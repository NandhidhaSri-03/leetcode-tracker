// Last updated: 9/11/2026, 10:30:38 AM
1class Solution {
2    public int findSubstringInWraproundString(String p) {
3        int[] count=new int[26];
4        int max=0;
5        for (int i=0;i<p.length();i++){
6            if (i>0 && (p.charAt(i)-p.charAt(i-1)==1 || p.charAt(i-1)-p.charAt(i)==25)) max++;
7            else max=1;
8            int ind=p.charAt(i)-'a';
9            count[ind]=Math.max(count[ind],max);            
10        }
11        int sum=0;
12        for (int i=0;i<26;i++){
13            sum+=count[i];
14        }
15        return sum;        
16    }
17}
// Last updated: 9/2/2026, 9:48:50 AM
1class Solution {
2    public boolean isMatch(String s, String p) {
3        int n=s.length();
4        int m=p.length();
5        boolean dp[][]=new boolean[n+1][m+1];
6        dp[0][0]=true;
7        for(int i=1;i<=m;i++){
8            if(p.charAt(i-1)=='*'){
9                dp[0][i]=dp[0][i-2];
10            }
11        }
12        for(int i=1;i<=n;i++){
13            for(int j=1;j<=m;j++){
14                if(p.charAt(j-1)=='.'||(s.charAt(i-1)==p.charAt(j-1))) dp[i][j]=dp[i-1][j-1];
15                else if(p.charAt(j-1)=='*'){
16                    dp[i][j]=dp[i][j-2];
17                    if (p.charAt(j - 2) == '.' || p.charAt(j - 2) == s.charAt(i - 1)) {
18                        dp[i][j]=dp[i][j]||dp[i-1][j];}
19                }
20            }
21        }
22        return dp[n][m];
23    }
24}
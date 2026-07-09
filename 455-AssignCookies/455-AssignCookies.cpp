// Last updated: 7/9/2026, 9:47:08 AM
class Solution {
public:
    int findContentChildren(vector<int>& g, vector<int>& s) {
        if (s.size() == 0)return 0;
        int j = 0;
        int res = 0;
        sort(g.begin(),g.end());
        sort(s.begin(),s.end());
        for (int i = 0; i < g.size(); i++) {
            if(j>=s.size())return res;
            if (g[i] <= s[j]) res++;
            else i--;
            j++; 
        }
        return res;
    }
};
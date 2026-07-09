// Last updated: 7/9/2026, 9:46:48 AM
class Solution {
public:
    bool reorderedPowerOf2(int n) {
      string s = to_string(n);
      sort(s.begin(),s.end());
      for(int i=0;i<31;i++){
        int power = 1<<i;
        string p = to_string(power);
        sort(p.begin(),p.end());
        if(s==p)
        return true;
      }  
      return false;
    }
};
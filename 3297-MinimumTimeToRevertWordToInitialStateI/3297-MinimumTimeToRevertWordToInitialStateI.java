// Last updated: 7/9/2026, 9:45:16 AM
class Solution {
    public int minimumTimeToInitialState(String word, int k) {
        int count = 1;
        for(int i=k; i<word.length(); i+=k){
            if(checkPrefix(word, i))
                return count;
            count++;
        }
        return count;
    }
    private boolean checkPrefix(String word, int idx){
        for(int i=idx; i<word.length(); i++){
            if(word.charAt(i-idx) != word.charAt(i))
                return false;
        }
        return true;
    }
}
// Last updated: 7/9/2026, 9:46:10 AM
class Solution {
    public boolean closeStrings(String word1, String word2) {
        int freq[]=new int[26];
        int freq2[]=new int[26];
        for(int i=0;i<word1.length();i++){
            freq[word1.charAt(i)-'a']++;
        }
        for(int i=0;i<word2.length();i++){
            freq2[word2.charAt(i)-'a']++;
        }
       for(int i=0;i<freq.length;i++){
        if(freq[i]==freq2[i]){
            continue;
        }
        if(freq[i]==0||freq2[i]==0){
            return false;
        }

       }
       Arrays.sort(freq);
       Arrays.sort(freq2);
       for(int i=0;i<freq.length;i++){
        if(freq[i]!=freq2[i]){
            return false;
        }
       }
        return true;
    }
}
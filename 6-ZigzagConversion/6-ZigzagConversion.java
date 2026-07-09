// Last updated: 7/9/2026, 9:48:58 AM
class Solution {
    public String convert(String s, int numRows) {
        int n = s.length();
        char[] arr = s.toCharArray();
        int index = 0;
        if (numRows == 1 || numRows >= n) {
            return s;
        }
        // create string builder for numRows
        StringBuilder[] sb = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            sb[i] = new StringBuilder();
        }
        while (index < n) {
            // Go down
            for (int j = 0; j < numRows && index < n; j++) {
                sb[j].append(arr[index++]);
            }
            // Go up
            for (int j = numRows - 2; j > 0 && index < n; j--) {
                sb[j].append(arr[index++]);
            }
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            res.append(sb[i]);
        }
        return res.toString();
    }
}
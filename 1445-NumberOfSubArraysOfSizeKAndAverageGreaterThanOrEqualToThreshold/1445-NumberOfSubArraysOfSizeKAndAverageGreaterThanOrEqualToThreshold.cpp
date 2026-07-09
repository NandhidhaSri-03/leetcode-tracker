// Last updated: 7/9/2026, 9:46:16 AM
class Solution {
public:
    int numOfSubarrays(vector<int>& arr, int k, int threshold) {
        int n = arr.size();
        int target = k * threshold;
        int count = 0;
        int windowSum = 0;

        for (int i = 0; i < n; i++) {
            windowSum += arr[i];

            if (i >= k) {
                windowSum -= arr[i - k];
            }

            if (i >= k - 1 && windowSum >= target) {
                count++;
            }
        }

        return count;
    }
};
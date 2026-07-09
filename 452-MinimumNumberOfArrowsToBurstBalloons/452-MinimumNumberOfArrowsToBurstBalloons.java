// Last updated: 7/9/2026, 9:47:09 AM
class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));

        int ans = 1;
        int h = points[0][1];

        for (int i = 1; i < points.length; i++) {
            if (points[i][0] <= h) {
                h = Math.min(h, points[i][1]); // narrow the valid arrow window
            } else {
                ans++;                          // current group done, fire arrow
                h = points[i][1];              // start fresh group
            }
        }
        return ans;
    }
}
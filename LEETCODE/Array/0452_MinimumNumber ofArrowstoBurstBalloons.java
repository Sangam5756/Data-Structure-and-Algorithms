class Solution {
    public int findMinArrowShots(int[][] points) {
 int n = points.length;

        if (n == 0) return 0;

        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));

        int[] currentInterval = points[0];
        int count = 1;

        for (int i = 1; i < n; i++) {
            int currStart = points[i][0];
            int currEnd = points[i][1];

            int prevEnd = currentInterval[1];

            if (currStart > prevEnd) {
                count++;
                currentInterval = points[i];
            } else {
                currentInterval[0] = currStart;
                currentInterval[1] = Math.min(currEnd, prevEnd);
            }
        }
        return count;
    }
}

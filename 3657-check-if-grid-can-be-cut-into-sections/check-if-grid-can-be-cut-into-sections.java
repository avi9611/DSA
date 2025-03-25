class Solution {
  public boolean checkValidCuts(int n, int[][] rectangles) {
    int[][] xCuts = new int[rectangles.length][2];
    int[][] yCuts = new int[rectangles.length][2];

    for (int i = 0; i < rectangles.length; i++) {
      xCuts[i][0] = rectangles[i][0];
      xCuts[i][1] = rectangles[i][2];
      yCuts[i][0] = rectangles[i][1];
      yCuts[i][1] = rectangles[i][3];
    }

    return Math.max(validCuts(xCuts), validCuts(yCuts)) >= 3;
  }

// using merge intervals algorithm
  private int validCuts(int[][] intervals) {
    int cnt = 0;
    int prevEnd = 0;

    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

    for (int[] interval : intervals) {
      int currStart = interval[0];
      int currEnd = interval[1];
      if (currStart < prevEnd) {
        prevEnd = Math.max(prevEnd, currEnd);
      } else {
        prevEnd = currEnd;
        cnt++;
      }
    }

    return cnt;
  }
}
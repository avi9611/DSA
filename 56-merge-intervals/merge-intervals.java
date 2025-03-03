class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length == 0) return new int[0][];

        //sort intervals based on start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> mergedIntervals = new ArrayList<>();

        //initialize with first interval
        int start = intervals[0][0];
        int end = intervals[0][1];

        //traverse the merged intervals
        for(int i = 0; i < intervals.length; i++){
            int currentStart = intervals[i][0];
            int currentEnd = intervals[i][1];

            if(currentStart <= end){
                //merge intervals by  updating the end
                end = Math.max(end, currentEnd);
            } else {
                // else add previous merged intervals and update start & end
                mergedIntervals.add(new int[]{start, end});
                start = currentStart;
                end = currentEnd;
            }
        }

        //add last interval
        mergedIntervals.add(new int[]{start, end});

        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
    }
}
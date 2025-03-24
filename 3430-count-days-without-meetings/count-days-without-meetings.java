class Solution {
    public int countDays(int days, int[][] meetings) {
        // Sort meetings by start day
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));

        int occupiedDays = 0, prevEnd = 0;

        // Merge intervals and count occupied days
        for(int[] meeting: meetings){
            int start = meeting[0], end = meeting[1];

            if(start > prevEnd + 1){
                // Count free days between meetings
                occupiedDays += (end - start + 1);
            } else if(end > prevEnd){
                // Merge overlapping meeting
                occupiedDays += (end - prevEnd);
            }

            prevEnd = Math.max(prevEnd, end);
        }
        // Total free days = available days - occupied days
        return days - occupiedDays;
    }
}
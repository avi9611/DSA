class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        long sum = 0;
        long minX = 0, maxX = 0;

        for(int diff: differences){
            sum += diff;
            minX = Math.min(minX, sum);
            maxX = Math.max(maxX, sum);
        }

        long start = lower - minX;
        long end = upper - maxX;

        return (int)Math.max(0, end - start + 1);
    }
}
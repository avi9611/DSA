class Solution {
    public long coloredCells(int n) {
        //This is an arithmetic sequence with a common difference of 4.
        return (long) n * n + (long) (n - 1) * (n-1);
    }
}
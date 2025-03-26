class Solution {
    public int minOperations(int[][] grid, int x) {
        List<Integer> list = new ArrayList<>();
        int m = grid.length, n = grid[0].length;

        // Convert 2D grid to 1D list and check feasibility
        int remainder = grid[0][0] % x;
        for(int[] row: grid){
            for(int num: row){
                // Not possible
                if(num % x != remainder) return -1;
                list.add(num);
            }
        }

        // Sort the list & find the median
        Collections.sort(list);
        int median = list.get(list.size() / 2);
        int operations = 0;

        // Calculate the total operations needed
        for(int num: list){
            operations += Math.abs(num - median) / x;
        }
        return operations;
    }
}
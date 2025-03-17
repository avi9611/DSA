class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<int[]> result = new ArrayList<>();
        int i = 0, j = 0;

        while(i < nums1.length && j < nums2.length){
            // Same id, sum the values
            if(nums1[i][0] == nums2[j][0]){
                result.add(new int[]{nums1[i][0], nums1[i][1] + nums2[j][1]});
                i++;
                j++;
            } else if (nums1[i][0] < nums2[j][0]){
                // nums1 has a smaller id, add it and move i
                result.add(nums1[i]);
                i++;
            } else {
                 // nums2 has a smaller id, add it and move j
                result.add(nums2[j]);
                j++;
            }
        }

        // Add remaining elements from nums1
        while(i < nums1.length){
            result.add(nums1[i++]);
        }
        // Add remaining elements from nums2
        while(j < nums2.length){
            result.add(nums2[j++]);
        }
        return result.toArray(new int[result.size()][]);
    }
}
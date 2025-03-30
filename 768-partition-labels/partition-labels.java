class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> result = new ArrayList<>();
        int[] lastIdx = new int[26];

        // Store the last occurrence of each character
        for(int i = 0; i < s.length(); i++){
            lastIdx[s.charAt(i) - 'a'] = i;
        }

        // Partition the string greedily
        int start = 0, end = 0;
        for(int i = 0; i < s.length(); i++){
            end = Math.max(end, lastIdx[s.charAt(i) - 'a']);
            // Found a partition
            if(i == end){
                result.add(end - start + 1);
                start = i + 1;
            }
        }
        return result;
    }
}
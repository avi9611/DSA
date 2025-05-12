class Solution {
    public int[] findEvenNumbers(int[] digits) {
        Set<Integer> result = new HashSet<>();
        int[] freq = new int[10];

        for(int digit: digits){
            freq[digit]++;
        }
        
        for(int i = 0; i < 10; i++){
            if(freq[i] == 0) continue;
            for(int j = 0; j < 10; j++){
                if(freq[j] == 0) continue;
                for(int k = 0; k < 10; k++){
                    if(freq[k] == 0 || k % 2 != 0) continue;

                    int[] used = new int[10];
                    used[i]++;
                    used[j]++;
                    used[k]++;

                    boolean isValid = true;
                    for(int d = 0; d < 10; d++){
                        if(used[d] > freq[d]){
                            isValid = false;
                            break;
                        }
                    }
                    if(!isValid) continue;
                    if(i == 0) continue;

                    int num = i * 100 + j * 10 + k;
                    result.add(num);
                }
            }
        }
        List<Integer> resultList = new ArrayList<>(result);
        Collections.sort(resultList);
        int[] newResult = new int[resultList.size()];
        for(int i = 0; i < resultList.size(); i++){
            newResult[i] = resultList.get(i);
        }
        return newResult;
    }
}
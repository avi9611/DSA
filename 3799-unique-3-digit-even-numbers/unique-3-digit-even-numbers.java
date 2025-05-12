class Solution {
    public int totalNumbers(int[] digits) {
        Set<Integer> set = new HashSet<>();
        int[] freq = new int[10];

        for(int digit: digits){
            freq[digit]++;
        }

        for(int i = 0; i < 10; i++){
            if(i == 0) continue;
            for(int j = 0; j < 10; j++){
                for(int k = 0; k < 10; k++){
                    if(k % 2 != 0) continue;

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

                    if(isValid){
                        int num = i * 100 + j * 10 + k;
                        set.add(num);
                    }
                }
            }
        }
        return set.size();
    }
}
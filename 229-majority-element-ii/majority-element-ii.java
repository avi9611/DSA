class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        if(n==0) return new ArrayList<>();

        int potentialNum1=0, potentialNum2=0, cnt1=0, cnt2=0;

        //1st pass checking potential Number
        for(int num: nums){
            if(num == potentialNum1){
                cnt1++;
            } else if(num == potentialNum2){
                cnt2++;
            } else if(cnt1 == 0){
                potentialNum1 = num;
                cnt1 = 1;
            } else if(cnt2 == 0){
                potentialNum2 = num;
                cnt2 = 1;
            } else {
                cnt1--;
                cnt2--;
            }
        }
        //2nd pass for verifying the numbers
        cnt1 = 0;
        cnt2 = 0;

        for(int num: nums){
            if(num == potentialNum1) cnt1++;
            else if(num == potentialNum2) cnt2++;
        }

        List<Integer> result = new ArrayList<>();
        if(cnt1 > n/3) result.add(potentialNum1);
        if(cnt2 > n/3) result.add(potentialNum2);

        return result;
    }
}
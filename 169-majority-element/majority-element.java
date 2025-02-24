class Solution {
    public int majorityElement(int[] nums) {
        int cnt=0;
        int repli=0;

        for(int num: nums){
            if(cnt==0){
                repli=num;
            }
            if(num==repli){
                cnt++;
            } else {
                cnt--;
            }
        }
        return repli;
    }
}
class Solution {
    public String largestNumber(int[] nums) {
        String[] strNum=new String[nums.length];

        for(int i=0; i<nums.length; i++){
            strNum[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(strNum, (a,b)->(b+a).compareTo(a+b));

        if(strNum[0].equals("0")){
            return "0";
        }

        StringBuilder result = new StringBuilder();
        for(String num: strNum){
            result.append(num);
        }
        return result.toString();
    }
}
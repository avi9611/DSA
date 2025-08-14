class Solution {
    public String largestGoodInteger(String num) {
        String maxi = "";

        for(int i = 0 ; i <= num.length() - 3; i++){
            String sub = num.substring(i, i + 3);

            if(sub.charAt(0) == sub.charAt(1) && sub.charAt(1) == sub.charAt(2)){
                if(maxi == "" || sub.compareTo(maxi) > 0){
                    maxi = sub;
                }
            }
        }
        return maxi;
    }
}
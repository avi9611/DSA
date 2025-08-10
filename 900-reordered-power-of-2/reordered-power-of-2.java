class Solution {
    public boolean reorderedPowerOf2(int n) {
        String target = convoy(n);

        for(int i = 0; i < 31; i++){
            int power = 1 << i;
            if(convoy(power).equals(target)){
                return true;
            }
        }
        return false;
    }
    private String convoy(int num){
        char[] arr = String.valueOf(num).toCharArray();
        java.util.Arrays.sort(arr);
        return new String(arr);
    }
}
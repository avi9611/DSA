class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        backtrack(0, s, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int start, String s, List<String> current, List<List<String>> result){
        if(start == s.length()){
            result.add(new ArrayList<>(current));
        }

        for(int end = start + 1; end <= s.length(); end++){
            String substr = s.substring(start, end);
            if(isPali(substr)){
                current.add(substr);
                backtrack(end, s, current, result);
                current.remove(current.size() - 1);
            }
        }
    }

    private boolean isPali(String str){
        int left = 0, right = str.length() - 1;
        while(left < right){
            if(str.charAt(left++) != str.charAt(right--)) return false;
        }
        return true;
    }
}